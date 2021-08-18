package com.seo.springextend.Controller;

import com.seo.springextend.Service.LocalHostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.LivenessState;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlPlaneController {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;
    @Autowired
    LocalHostService localHostService;

    // 상태 정보만 바꾼 것이다. 실제 에플리케이션이 꺼지거나 커넥션을 못받는 것이 아니다.
    // 따라서 applicaition의 상태를 참조해서 보내는 쪽을 어디에 보낼지 결정해야 한다
    @GetMapping("/block")
    public String block(){
        AvailabilityChangeEvent.publish(applicationEventPublisher, this, ReadinessState.REFUSING_TRAFFIC);
        return "Block requests "+ localHostService.getLocalHostInfo();
    }
    @GetMapping("/turnoff")
    public String turnOff(){
        AvailabilityChangeEvent.publish(applicationEventPublisher, this, LivenessState.BROKEN);
        return "Broken " + localHostService.getLocalHostInfo();
    }

    // 리스너 등록
    // 이벤트 리스너는 별도의 스레드로 돌지 않는다 따라서 위의 block 요청은 이벤트 리스너의 처리를 기다린다.
    // 따라서 원하는 대로 코드가 돌아가지 않음 리스너에서 상태를 변경후 다시 정상 상태로 할 때 가급적 async 사용
    // 리스너는 빈이 아니다
    @Async
    @EventListener
    public void onStateChanged(AvailabilityChangeEvent<ReadinessState> readiness ) throws InterruptedException {

        System.out.println("state changed to" + readiness.getState());
        if(readiness.getState() == ReadinessState.REFUSING_TRAFFIC){
            Thread.sleep(15000L);
            AvailabilityChangeEvent.publish(applicationEventPublisher,this,ReadinessState.ACCEPTING_TRAFFIC);
        }
    }
}

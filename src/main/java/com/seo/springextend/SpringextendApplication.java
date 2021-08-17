package com.seo.springextend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync // TaskExecutionAutoConfiguration 자동 설정 적용
// 비동기로 실행 가능 자동 설정 때문에 properties로 조정가능하다
@EnableScheduling // TaskSchedulingAutoConfiguration 자동 설정 적용
// 주기적으로 operation 실행 하고 싶을 때 사용
@SpringBootApplication
public class SpringextendApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringextendApplication.class, args);
    }
    // 스프링 부트는 빈 등록 과정이 2개
    // 1.어플리케이션에 정의한 빈 등록
    // 2. 자동설정이 제공하는 빈 등록
    // 이때 1번에서 정의한 빈을 2번에서 빈을 재정의 하는 기능을 자동으로 제공했지만  2.1 이후 부터는 허용하지 않음
    // 프로퍼티에서 spring.main.allow-bean-definition-overriding=true 로 바꿀수 있음

}

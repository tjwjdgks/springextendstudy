package com.seo.springextend.Controller;

import com.seo.springextend.Properties.ConfigTreeProperties;
import com.seo.springextend.Service.LocalHostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.availability.ApplicationAvailability;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    //server 상태 등록 // bean spring boot 자동 등록
    @Autowired
    ApplicationAvailability availability;
    @Autowired
    ConfigTreeProperties configTreeProperties;
    @Autowired
    LocalHostService hostService;
    @GetMapping("/status/server")
    public String getStatus(){
        return "Application is now " + availability.getLivenessState() + " " + availability.getReadinessState()
                +" " + hostService.getLocalHostInfo()
                +" " + configTreeProperties.getMessage();
    }
}

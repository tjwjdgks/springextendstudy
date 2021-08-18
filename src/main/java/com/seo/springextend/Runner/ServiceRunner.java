package com.seo.springextend.Runner;

import com.seo.springextend.Properties.ServiceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ServiceRunner implements ApplicationRunner {
    @Autowired
    ServiceProperties serviceProperties;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(serviceProperties.getMessage());
    }
}

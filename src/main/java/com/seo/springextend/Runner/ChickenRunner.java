package com.seo.springextend.Runner;

import com.seo.springextend.Properties.ChickenProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ChickenRunner implements ApplicationRunner {
    @Autowired
    ChickenProperties chickenProperties;
    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("ChickenRunner  " + chickenProperties.getSize());
        System.out.println("ChickenRunner  " + chickenProperties.getName());
        System.out.println("ChickenRunner  " + chickenProperties.getCount());
        System.out.println("ChickenRunner  " + chickenProperties.getPeriod().getMonths());

    }
}

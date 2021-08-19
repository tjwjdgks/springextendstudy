package com.seo.springextend.Runner;

import com.seo.springextend.Properties.ConfigTreeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
public class ConfigTreeRunner implements ApplicationRunner {
    @Autowired
    ConfigTreeProperties configTreeProperties;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(configTreeProperties.getMessage());
    }
}

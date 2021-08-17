package com.seo.springextend.Config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BeanConfigTest {

    @Autowired
    BeanConfig beanConfig;

    @Test
    void myBeanTest(){
        System.out.println(beanConfig.myBean());
        System.out.println(beanConfig.myBean());
        System.out.println(beanConfig.myBean());
    }
}
package com.seo.springextend.Config;

import org.apache.tomcat.jni.Library;
import org.aspectj.apache.bcel.classfile.Code;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration// (proxyBeanMethods = false) 프록시 bean 객체 달라진다
public class BeanConfig {

    // 기본 Configuration 호출 -> cglib를 통해 proxy 만들어지고 -> my bean 객체 호출 되었을때 이전에 cache된 객체 호출된다
    //CGLIB는 코드 생성 라이브러리로서(Code Generator Library) 런타임에 동적으로 자바 클래스의 프록시를 생성해주는 기능을 제공한다
    @Bean
    public Object myBean(){
        return new Object();
    }
}

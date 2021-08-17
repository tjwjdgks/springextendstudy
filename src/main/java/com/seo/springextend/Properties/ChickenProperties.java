package com.seo.springextend.Properties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.util.unit.DataSize;

import java.time.Period;

// properties Component 등록 || autoconfiguration 설정 SpringextendApplication.class 에서 bean 등록
//@Component
@ConstructorBinding // getter 와 생성자 필요 (setter 필요 x) 바뀌지 않은 properties bean
@ConfigurationProperties(prefix = "chicken")
@Getter
@AllArgsConstructor
public class ChickenProperties {
    private int count;
    private String name;
    private DataSize size;
    private Period period;
}

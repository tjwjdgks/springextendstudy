package com.seo.springextend.Properties;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties(prefix = "my")
@Getter
@AllArgsConstructor
public class ConfigTreeProperties {
    String message;
}

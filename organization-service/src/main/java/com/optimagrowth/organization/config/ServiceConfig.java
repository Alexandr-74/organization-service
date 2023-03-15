package com.optimagrowth.organization.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "example")
@Setter
@Getter
public class ServiceConfig {
    private String property;
    public String getProperty() {
        return property;
    }
}

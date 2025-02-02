package com.bong3ng.limits_service.configuration;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
@Data
public class Configuration {
    private int minimum;
    private int maximum;

}

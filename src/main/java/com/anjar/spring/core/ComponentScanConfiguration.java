package com.anjar.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.anjar.spring.core.configuration"
})
public class ComponentScanConfiguration {
}

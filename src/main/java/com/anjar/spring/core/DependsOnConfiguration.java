package com.anjar.spring.core;

import com.anjar.spring.core.data.Bar;
import com.anjar.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Slf4j
@Configuration
public class DependsOnConfiguration {

    @Lazy
    @Bean
    @DependsOn({"bar"})
    public Foo foo(){
        log.info("Creating new Foo");
        return new Foo();
    }

    @Bean
    public Bar bar(){
        log.info("Creating new Bar");
        return new Bar();
    }
}

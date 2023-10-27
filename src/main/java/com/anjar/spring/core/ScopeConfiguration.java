package com.anjar.spring.core;

import com.anjar.spring.core.data.Bar;
import com.anjar.spring.core.data.Foo;
import com.anjar.spring.core.scope.DoubletonScope;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class ScopeConfiguration {

    @Bean
    @Scope("prototype")
    public Foo foo(){
        log.info("Create New Foo");
        return new Foo();
    }

    @Bean
    @Scope("prototype")
    public CustomScopeConfigurer customScopeConfigurer(){
       CustomScopeConfigurer configurer = new CustomScopeConfigurer();
       configurer.addScope("doubleton", new DoubletonScope());
       return  configurer;
    }


    @Bean
    @Scope("doubleton")
    public Bar bar(){
        log.info("Create New Bar");
        return new Bar();
    }
}

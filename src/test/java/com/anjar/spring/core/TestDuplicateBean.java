package com.anjar.spring.core;

import com.anjar.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDuplicateBean {

    @Test
    void testDublicate() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);
        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Foo foo1 = applicationContext.getBean("foo1",Foo.class);
            Foo foo2 = applicationContext.getBean("foo2",Foo.class);
        });
    }


}

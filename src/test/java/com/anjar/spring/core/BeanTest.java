package com.anjar.spring.core;

import com.anjar.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {
    @Test
    void testCreateBean() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanTest.class);
        Assertions.assertNotNull(applicationContext);

    }

    @Test
    void testGetBean(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanTest.class);
        Foo foo1 = applicationContext.getBean(Foo.class);
        Foo foo2 = applicationContext.getBean(Foo.class);

        Assertions.assertSame(foo1,foo2);
    }
}

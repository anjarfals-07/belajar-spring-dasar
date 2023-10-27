package com.anjar.spring.core.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.ArrayList;
import java.util.List;

public class DoubletonScope implements Scope {
    private List<Object> object = new ArrayList<>(2);
    private Long counter = -1L;

    @Override
    public Object get(String s, ObjectFactory<?> objectFactory) {
        counter++;
        if (object.size() == 2) {
            int index = (int) (counter % 2);
            return object.get(index);
        } else {
            Object objects = objectFactory.getObject();
            object.add(objects);
            return objects;
        }
    }

    @Override
    public Object remove(String s) {
        if (!object.isEmpty()) {
            return object.remove(0);
        }
        return null;
    }

    @Override
    public void registerDestructionCallback(String s, Runnable runnable) {

    }

    @Override
    public Object resolveContextualObject(String s) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}

package org.test.hospitalserver;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

public class ReflectTest {

    @Test
    public void test() throws ClassNotFoundException {
        Class<? extends ReflectTest> aClass = ReflectTest.class;
        Class<?> constructTest = aClass.getClassLoader().loadClass("org.test.hospitalserver.ConstructTest");
        System.out.println("constructTest "+constructTest);
        Constructor<?>[] constructors = constructTest.getConstructors();
        for(Constructor c:constructors){
            System.out.println("Con "+c);
            System.out.println(c.getName());
        }
    }

    
}

class ConstructTest{
    
    private String name;
    private int age;

    public ConstructTest(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
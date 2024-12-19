package com.yeongjae;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        System.out.println("MAIN START");


        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(PersonLoader.class);

        Person regPerson = new Person();
        regPerson.setName("수동자");
        regPerson.setAge(10);

        context.registerBean("reg", Person.class, new Supplier<Person>() {
            @Override
            public Person get() {
                return regPerson;
            }
        });

        Person person1 = context.getBean("person",Person.class);
        person1.setName("홍길동");
        person1.setAge(20);
        System.out.println("person1: " + person1);
        System.out.println("이름:" + person1.getName() + ",나이 : " + person1.getAge());

        Person person2 = context.getBean("reg",Person.class);
        System.out.println("person2: " + person2);
        System.out.println("이름:" + person2.getName() + ",나이 : " + person2.getAge());


    }
}
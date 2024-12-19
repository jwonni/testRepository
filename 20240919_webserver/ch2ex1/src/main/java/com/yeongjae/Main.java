package com.yeongjae;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {


    public static void main(String[] args) {
        System.out.println("MAIN START");

        // NEW 생성자를 이용한 객체생성
        Person person1 = new Person();
        person1.setName("오영재");
        person1.setAge(20);

        System.out.println("person1: " + person1);
        System.out.println("이름:" + person1.getName() + ",나이 : " + person1.getAge());

        // 컨텍스트를 이용한 객체 조회1
        ApplicationContext context =
                new AnnotationConfigApplicationContext(PersonLoader.class);
        Person newOne = context.getBean("hong",Person.class);

        System.out.println("newOne: " + newOne);
        System.out.println("이름:" + newOne.getName() + ",나이 : " + newOne.getAge());

        // 컨텍스트를 이용한 객체 조회2
        // TODO: person1과 같은 객체인지 확인
        Person newOne2 = context.getBean("lee", Person.class);
        System.out.println("newOne2: " + newOne2);
        System.out.println("이름:" + newOne2.getName() + ",나이 : " + newOne2.getAge());

        Person newOne3 = context.getBean("super", Person.class);
        System.out.println("newOne3: " + newOne3);
        System.out.println("이름:" + newOne3.getName() + ",나이 : " + newOne3.getAge());






    }


}

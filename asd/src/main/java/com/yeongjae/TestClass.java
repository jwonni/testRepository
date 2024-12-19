package com.yeongjae;

public class TestClass {

    private static TestClass instance;

    public static TestClass getInstance() {
        if(TestClass.instance == null) {
            TestClass.instance = new TestClass();
        }
        return TestClass.instance;
    }

    private TestClass() {

    }



}

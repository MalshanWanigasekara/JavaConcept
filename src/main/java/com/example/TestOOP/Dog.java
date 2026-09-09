package com.example.TestOOP;

public class Dog extends Animal{

    static {
        System.out.println("static block of dog");
    }


    public static int getValue() {
        try {
            System.out.println("dog try");
            return 10;
        } catch (Exception e) {
            System.out.println(" dog catch");
            return 20;
        } finally {
            System.out.println("dog finally");
            return 30;
        }
    }

    @Override
    public void run(){
        System.out.println("Dog runnning");
    }
}

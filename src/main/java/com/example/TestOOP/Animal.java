package com.example.TestOOP;

public class Animal {

    static {
        System.out.println("static block animal");
    }

    public void run(){
        System.out.println("Animal Running");
    }

    public static int getValue() {
        try {
            System.out.println("try");
            return 10;
        } catch (Exception e) {
            System.out.println("catch");
            return 20;
        } finally {
            System.out.println("finally");
            return 30;
        }
    }

    public static int getValue2() {
        try {
            System.out.println("try");
            return 10;
        } catch (Exception e) {
            System.out.println("catch");
            return 20;
        } finally {
            System.out.println("finally");
            return 30;
        }
    }
}

package com.example;

import com.example.TestOOP.Animal;
import com.example.TestOOP.Cat;
import com.example.TestOOP.Dog;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static {
        System.out.println("main static initializer");
    }

    static int value = getValue();
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        Dog animal = new Dog();
//        Dog dog = new Dog();
        animal.run();
//        dog.run();

        Animal cat = new Cat();

        getValue();

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
    }

    static {
        System.out.println("intialize value is "+value);
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
}
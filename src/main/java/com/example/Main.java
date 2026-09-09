package com.example;

import com.example.Interfaces.AdditionCalculator;
import com.example.Interfaces.SubstractionCalculator;
import com.example.StreamAPIs.TestStreams;
import com.example.TestOOP.Animal;
import com.example.TestOOP.Cat;
import com.example.TestOOP.Dog;

import java.util.function.Predicate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        AdditionCalculator ac = (a, b) -> a+b;
//        System.out.println(ac.add(1,2));

        SubstractionCalculator sc = (c, d) ->c-d;
//        System.out.println(sc.sub(5,2));

        Predicate<Integer> even = (a)-> a%2==0;
//        System.out.println(even.test(8));

        TestStreams.getAllFamilyPeople();

        TestStreams.sumEven();

        TestStreams.EmployeeSorting();



    }


}
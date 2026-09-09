package com.example.StreamAPIs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestStreams {

    private static List<Integer> numberList = List.of(4,5,3,8,1,9);

    private static List<List<String>> familyPeople = List.of(List.of("Malshan", "Sawani", "Evan balu patiya"),
            List.of("Amma", "Thaththa", "Nangi"),
            List.of("ayiya", "akka", "sudu", "doni")
    );



    public static void TestStreamOperations(){

        List<Integer> newList = numberList.stream().sorted().map(x->x*2).toList();

        newList.forEach(System.out::println);
    }

    public static void getAllFamilyPeople(){

        List<String> allNames = familyPeople.stream().flatMap(family -> family.stream().sorted())
                .toList();

        allNames.forEach(System.out::println);
    }

    public static void sumEven(){
        int[] numbers = {1, 2, 3, 4, 5, 6};

        System.out.println(Arrays.stream(numbers).filter(x-> x % 2==0).sum());
    }

    public static void EmployeeSorting(){
        List<Employee> employeeList = List.of(
                new Employee("Randhaja", 14000),
                new Employee("Sawani", 5000),
                new Employee("Malshan",14000));

        employeeList.stream().sorted(
                Comparator.comparing(Employee::getSalary)//ascending
                        .reversed()//descending
                        .thenComparing(Employee::getName) //only when tie breaker
        ).forEach(e->System.out.println(e.name));
    }
}

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }


    public double getSalary() {
        return salary;
    }

}

package com.example.StreamAPIs;

import java.nio.file.Files;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.nio.*;

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

    public void greet() {

        List<String> names = Arrays.asList("cola","Malshan");

//        names = Arrays.asList("moda sawa");


        names.forEach(name-> System.out.println(name));


        Runnable task1 = () -> System.out.println(names);

    }

    public static void sumEven(){
        int[] numbers = {1, 2, 3, 4, 5, 6};

        System.out.println(Arrays.stream(numbers)
                .filter(x-> x % 2==0).sum());

        final List<String> intlist = Arrays.asList("1","2","3");

        intlist.add("5");

//        intlist = Arrays.asList("sdasda"); incorrect reassign to final
    }

    public static void secondLargets(){
        int[] numbers = {1, 2, 3, 4, 5, 6};

        Arrays.stream(numbers).reduce(0, Math::max);
        System.out.println();
    }

    public static void EmployeeSorting(){
        List<Employee> employeeList = List.of(
                new Employee("IT","Randhaja", 14000),
                new Employee("IT", "Sawani", 5000),
                new Employee("HR", "Malshan",14000));

        employeeList.stream().sorted(
                Comparator.comparing(Employee::getSalary)//ascending
                        .reversed()//descending
                        .thenComparing(Employee::getName) //only when tie breaker
        ).forEach(e->System.out.println(e.name));

        Map<String, Double> departmentSal = new HashMap<>();

        employeeList.forEach(employee -> {
            if(employee.getSalary() > departmentSal.getOrDefault(employee.getDepartment(), 0.00)){
                departmentSal.put(employee.getDepartment(), employee.getSalary());
            }
        });

        departmentSal.entrySet().forEach(departmentSalary ->{
            System.out.println(departmentSalary.getKey()+" : "+ departmentSalary.getValue());
        });

        Map<String, Double> depSalaryy =  employeeList.stream().collect(Collectors.toMap(Employee::getDepartment, Employee::getSalary));


        Comparator<Employee> comparator =
                (employee1, employee2) ->
                        employee1.getSalary().compareTo(employee2.getSalary());




        Map<String, Employee> employeeSalMap =  employeeList.stream().collect(
                Collectors.toMap(
                        Employee::getDepartment, Function.identity(), BinaryOperator.maxBy(
                                Comparator.comparing(Employee::getSalary).thenComparing(
                                        Employee::getName
                                ).reversed()
                        )
                )
        );
    }

    public static void reduceOps(){
        List<String> alphabetName = List.of("M", "a", "l", "s", "h", "a", "n");

        String s = alphabetName.stream()
                .map(String::toUpperCase).reduce("", (val, element) -> val+element);

        System.out.println(s);

    }


}

class Employee {
    String department;
    String name;
    Double salary;


    public Employee(String department, String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.department = department;

    }

    public String getName() {
        return name;
    }


    public Double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }
}

sealed class Payment permits CardPayment{

}

non-sealed class CardPayment extends Payment {

}

class CCPayment extends CardPayment{

}


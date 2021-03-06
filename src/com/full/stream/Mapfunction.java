package com.full.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapfunction {                                  // map is used to convert String list into Integer string
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1","2","3","4","5","6","7","8");
        List<Integer> list1 = list.stream()
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println("String list is converted into Integer list ");
        System.out.println(list1);


        List<Employee> employeesList = Arrays.asList(
                new Employee(1, "Alex", 100),
                new Employee(2, "Brian", 100),
                new Employee(3, "Charles", 200),
                new Employee(4, "David", 200),
                new Employee(5, "Edward", 300),
                new Employee(6, "Frank", 400)
        );

        List<Integer> distinctSalaries = employeesList.stream()
                .map( e -> e.salary )
                .distinct()
                .collect(Collectors.toList());
        System.out.println("The distant salaries");
        System.out.println(distinctSalaries);


    }
}

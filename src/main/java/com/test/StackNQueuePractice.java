package com.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class StackNQueuePractice {

    public static void main(String[] args) {



        String HOME = System.getProperty("user.home");
        Path p = Paths.get(HOME + "\\test.txt");
        List<Employee> empList = new ArrayList<Employee>();

        try {
            List<String> read = Files.readAllLines(p);


            empList = read.stream().map(s -> s.split(","))
                    .map(a -> new Employee(a[0], Integer.valueOf(a[1]), a[2]))
                    .collect(Collectors.toList());

        } catch (IOException e) {
            e.printStackTrace();
        }
        Stack<Employee> s = new Stack<>();
        Queue<Employee> q = new ArrayDeque<>();

        q.addAll(empList);
        s.addAll(empList);

        System.out.println(q.size());

        System.out.println("Queue");
        q.forEach(System.out::println);

        System.out.println("Stack");
        s.forEach(System.out::println);

        System.out.println("Queue --- ");
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

        System.out.println("Stack --- ");
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }


    }

}

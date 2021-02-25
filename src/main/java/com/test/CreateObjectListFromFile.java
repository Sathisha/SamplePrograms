package com.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CreateObjectListFromFile {


    public static void main(String[] args) throws IOException {

        //List<String> list = new ArrayList<String>();
        //list.addAll(Arrays.asList("abc1", "abc2", "abc3"));
        //list.stream().sorted().forEach(System.out::println);;

        //System.out.println();

        String HOME = System.getProperty("user.home");
        System.out.println(HOME);

        Path p = Paths.get(HOME+"\\test.txt");
        System.out.println(Files.exists(p));

        List<String> read = Files.readAllLines(p);

        List<Employee> empList = new ArrayList<Employee>();

        empList = read.stream().map(s->s.split(","))
                .map(a -> new  Employee(a[0], Integer.valueOf( a[1]), a[2]))
                .collect(Collectors.toList());

        System.out.println(empList.toString());



    }


}

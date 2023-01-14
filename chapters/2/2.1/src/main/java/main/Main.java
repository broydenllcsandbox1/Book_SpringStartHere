package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.Console;

public class Main {
    public static void main(String[] args) {
        Parrot p = new Parrot();
        var context = new AnnotationConfigApplicationContext();
        System.out.println("Hello, World!");
    }
}

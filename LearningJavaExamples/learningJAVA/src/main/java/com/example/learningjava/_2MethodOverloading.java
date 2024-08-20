package com.example.learningjava;

public class _2MethodOverloading {
    public static void main(String[] args) {
        System.out.println(add(5,15));
        System.out.println(add(5,15,10));
        System.out.println(add(5,15.0));
    }

    static int add(int a, int b) {
        System.out.println("This is FIRST method");
        return a + b;
    }

    // Overloaded method to add three integers
    static int add(int a, int b, int c) {
        System.out.println("This is SECOND method");
        return a + b + c;
    }

    // Overloaded method to add two doubles
    static double add(double a, double b) {
        System.out.println("This is THIRD method");
        return a + b;
    }
}

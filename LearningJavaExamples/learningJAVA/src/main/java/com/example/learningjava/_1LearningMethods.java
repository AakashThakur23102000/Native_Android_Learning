package com.example.learningjava;

public class _1LearningMethods {
    public static void main(String[] args) {
        System.out.println(" --- This is a Main Method --- ");
        sayHello();
        System.out.println("---> Sum is - " + sumTwoNumbers(5,10));
    }
    static void sayHello(){
        System.out.println("This is our created method.");
    }

    static int sumTwoNumbers(int a,int b){
        int sum;
        sum = a + b;
        return  sum;
    }
}
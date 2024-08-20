package com.example.learningjava;

public class _6InheritanceInJava {
    public static void main(String[] args) {
        Zen myInheritanceCar = new Zen(4);
        System.out.println(myInheritanceCar.printNumberOfTyres());
        myInheritanceCar.colorOfCar();
    }
}

class Vehicle {
    int tyres;

    Vehicle(int noOfTyres) {
        tyres = noOfTyres;
    }

    int printNumberOfTyres() {
        return tyres;
    }
}

class Zen extends Vehicle {
    Zen(int noOfTyres) {
        super(noOfTyres);
    }

    void colorOfCar() {
        System.out.println("Zen is of RED color.");
    }
}
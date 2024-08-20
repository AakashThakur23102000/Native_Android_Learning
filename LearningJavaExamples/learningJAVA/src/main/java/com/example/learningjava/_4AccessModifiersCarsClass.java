package com.example.learningjava;

public class _4AccessModifiersCarsClass {

    //states
    protected int year;
    int speed;
    //dynamic state received from constructor
    int model;

    //Constructor
    public _4AccessModifiersCarsClass(int carModel) {
        model = carModel;
    }

    //Methods
    void race() {
        speed = speed + 10;
    }

    void brake() {
        speed = speed - 10;
    }

    void printCarModel() {
        System.out.println("CAR MODEL - " + model);
    }
}


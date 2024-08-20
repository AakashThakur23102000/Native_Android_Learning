package com.example.learningjava;

public class _3Classes {
    public static void main(String[] args) {
        System.out.println(" ------ Main Method ------ ");

        //  defining object in java
        Car myCarClassVariable = new Car(2005);
        //  Setting my attributes;
        myCarClassVariable.speed = 500;
        myCarClassVariable.year = 200;
        myCarClassVariable.race();
        System.out.println(myCarClassVariable.speed);
        myCarClassVariable.printCarModel();
    }
}

//my created class
class Car {
    //states
    int year;
    int speed;
    //dynamic state received from constructor
    int model;

    //Constructor
    Car(int carModel) {
        model = carModel;
    }

    //Methods
    void race() {
        speed = speed + 10;
    }

    void brake() {
        speed = speed - 10;
    }

    void printCarModel(){
        System.out.println("CAR MODEL - "+model);
    }
}
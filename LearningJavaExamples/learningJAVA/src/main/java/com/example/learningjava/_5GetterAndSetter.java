package com.example.learningjava;

public class _5GetterAndSetter {
    public static void main(String[] args) {
        _5GetterAndSetterCarClass getterSetterCar = new _5GetterAndSetterCarClass();
        //getter
        System.out.println(getterSetterCar.year);
        System.out.println(getterSetterCar.getSpeedValue());
        //setter
        getterSetterCar.updateSpeedValue(500);
        System.out.println(getterSetterCar.getSpeedValue());
    }
}


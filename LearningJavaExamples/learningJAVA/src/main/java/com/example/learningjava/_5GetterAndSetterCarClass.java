package com.example.learningjava;

public class _5GetterAndSetterCarClass {
    public int year = 2004;
    private int speed;
    int getSpeedValue(){
        return speed;
    }
    void updateSpeedValue(int newSpeed){
        speed = newSpeed;
    }
}

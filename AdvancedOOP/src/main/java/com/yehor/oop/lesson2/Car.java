package com.yehor.oop.lesson2;

public class Car {
    int horsePower;
    String model;

    Car(int horsePower, String model) {
        this.horsePower = horsePower;
        this.model = model;
    }

    public void carDescription(){
        System.out.println("I have " + this.horsePower + " and the model is: " + this.model );
    }
    public void carDescription(boolean open){
        if (open){
            System.out.println("I have " + this.horsePower + " and the model is: " + this.model );
        }
    }
}

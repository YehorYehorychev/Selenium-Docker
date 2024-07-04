package com.yehor.oop.lesson2;

import org.w3c.dom.ls.LSOutput;

public class Bmw {

    public static void main(String[] args) {
        Car bmw = new Car(300,"M6");
        bmw.carDescription();
        bmw.carDescription(true);
    }
}

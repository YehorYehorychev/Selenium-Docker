package com.yehor.oop.incapsulation;

public class Mobile extends Computer {

    @Override
    public void load() {
        System.out.println("Mobile phone is loaded");
    }

    public Mobile(Ssd ssd, Ram ram) {
        super(ssd, ram);
    }
}

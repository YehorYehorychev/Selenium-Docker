package com.yehor.oop.incapsulation;

import org.w3c.dom.ls.LSOutput;

public class Laptop extends Computer {

    private int weight;

    public Laptop(){
        System.out.println("Constructor laptop");
    }

    @Override
    public void load() {
        open();
        System.out.println("Laptop is loaded");
    }

    @Override
    public void print() {
        super.print();
    }

    public Laptop(Ssd ssd, Ram ram, int weight) {
        super(ssd, ram);
        this.weight = weight;
    }
    public void open(){
        System.out.println("Laptop is opened");
    }

    public int getWeight() {
        return weight;
    }
}

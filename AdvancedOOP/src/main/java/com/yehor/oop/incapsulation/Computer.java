package com.yehor.oop.incapsulation;

public abstract class Computer {

    private Ssd ssd;
    private Ram ram;

    public Computer(Ssd ssd, Ram ram) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public Computer(){
        System.out.println("Constructor computer");
    }

    public abstract void load();

    public void print(){
        System.out.println(" SSD: " + ssd.getValue());
    }

    public Ssd getSsd() {
        return ssd;
    }

    public Ram getRam() {
        return ram;
    }
}

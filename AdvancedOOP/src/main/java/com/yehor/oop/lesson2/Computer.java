package com.yehor.oop.lesson2;

public class Computer {
    int displaySize = 16;
    int ram = 32;
    int ssd = 512;
    int price = 1999;
    String name = "macbook pro 16";

    Computer() {
        System.out.println("I was created");
    }

    Computer(int ram, int displaySize, int ssd) {
        this.ram = ram;
        this.displaySize = displaySize;
        this.ssd = ssd;
    }

    void boot(){
        System.out.println("I'm boot into the system");
    }
    void laptopState(){
        System.out.println("Ram: " + ram + " Display Size: " + displaySize + " SSD: " + ssd);
    }
}

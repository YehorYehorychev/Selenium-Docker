package com.yehor.oop.incapsulation;

public class OopLessonRunner {
    public static void main(String[] args) {
        Ram ram = new Ram(1024);
        Ssd ssd = new Ssd(512);

        //Computer computer = new Computer(ssd,ram);
        //computer.load();
        double sin = Math.sin(2.5);

        Laptop laptop = new Laptop(new Ssd(250),new Ram(64), 2);
        Laptop laptop2 = new Laptop(new Ssd(250),new Ram(64), 2);
        laptop.open();
        laptop.load();
        System.out.println(laptop.getClass());
        System.out.println(laptop.hashCode());
        System.out.println(laptop.equals(laptop2));
    }
}

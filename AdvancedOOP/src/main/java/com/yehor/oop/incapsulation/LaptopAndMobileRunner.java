package com.yehor.oop.incapsulation;

public class LaptopAndMobileRunner {

    public static void main(String[] args) {

        Computer laptop = new Laptop(new Ssd(250), new Ram(1024), 2);
        Computer mobile = new Mobile(new Ssd(2577), new Ram(1024));

        loadComputers(laptop, mobile);
        mobile.print();

    }

    public static void loadComputers(Computer... computers){
        for (Computer computer : computers) {
            computer.load();
            System.out.println();
        }
    }
}

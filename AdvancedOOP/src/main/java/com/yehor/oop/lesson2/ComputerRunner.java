package com.yehor.oop.lesson2;

public class ComputerRunner {

    public static void main(String[] args) {
       Computer macbook = new Computer();
       Computer macBookAir = new Computer(35, 14,256);
       macBookAir.laptopState();
    }
}

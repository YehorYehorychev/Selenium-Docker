package com.yehor.oop.task;

public class StringBuilder {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer value = new StringBuffer();
        for (int i = 0; i < 10000000; i++) {
            value.append(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTime) + " milliseconds");
    }
}


package com.yehor.oop.task;

public class TimeIntervalRunner {

    public static void main(String[] args) {
        TimeInterval timeinterval = createTimeInterval();

        TimeInterval timeInterval2 = new TimeInterval(timeinterval.totalSeconds());
        System.out.println(timeInterval2.totalSeconds());
        timeInterval2.print();

       TimeInterval sumIntervals =  timeinterval.sum(timeInterval2);
       sumIntervals.print();
    }

    private static TimeInterval createTimeInterval() {
        TimeInterval timeinterval = new TimeInterval(30,2,1);
        System.out.println(timeinterval.totalSeconds());
        return timeinterval;
    }
}

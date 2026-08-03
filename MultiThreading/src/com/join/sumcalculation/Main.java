package com.join.sumcalculation;

public class Main {
    public static void main(String[] args) {
        CalculateThread calculateThread=new CalculateThread();
        calculateThread.start();
        try {
            calculateThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Sum: "+calculateThread.getSum());
    }
}

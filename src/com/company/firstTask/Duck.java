package com.company.firstTask;

public class Duck implements Flyable{

    @Override
    public void fly (int a) {
        if (a >= 1 && a <= 10) {
            System.out.println("Duck can fly " + a + " meters");
        } else {
            throw new IllegalArgumentException("It's a duck. It can't fly this distance");
        }
    }

    public static void main (String[] args) {
        Duck duck = new Duck();
        duck.fly(11);
    }

}

package com.company.firstTask;

public class Bird implements Flyable{


    @Override
    public void fly(int a) {
        System.out.println("Bird can fly " + a + " meters");

    }

    public static void main (String[] args) {
        Bird bird = new Bird();
        bird.fly(10);

    }
}

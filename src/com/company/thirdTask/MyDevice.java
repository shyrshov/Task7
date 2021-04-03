package com.company.thirdTask;

public class MyDevice implements Volume, State {
    private boolean isOn = false;
    private double volumeLevel =0;

    @Override
    public void on() {
        System.out.println("Device is turned on");
        isOn = true;
    }

    @Override
    public void off() {
        System.out.println("Device is turned off");
        isOn = false;

    }

    @Override
    public void changeVolume(double value) {
        if (isOn) {
            volumeLevel = value;
            System.out.println("New volume level = " + volumeLevel);
        } else {
            throw new IllegalArgumentException("Please, turn device ON to change volume");
        }
    }

    public static void main(String[] args) {
        MyDevice myDevice = new MyDevice();
        myDevice.on();
        myDevice.changeVolume(10);
        myDevice.off();
        myDevice.changeVolume(20);

    }
}

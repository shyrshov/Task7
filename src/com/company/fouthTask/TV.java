package com.company.fouthTask;

public class TV extends TVDevice{

    private int volumeLevel;
    private int channelNumber;
    public TV(String modelName, boolean isOn, int volumeLevel, int channelNumber) {
        super(modelName, isOn);
        this.volumeLevel = volumeLevel;
        this.channelNumber= channelNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("TV turned On");
    }

    @Override
    public void powerOff() {
        isOn = false;
        System.out.println("TV turned Off");
    }

    @Override
    public void setChannel(int channel) {
        if (isOn) {
            channelNumber = channel;
            System.out.println("You changed channel to " + channel);
        } else {
            throw new IllegalArgumentException("Please, turn TV ON to change channel");
        }
    }

    @Override
    public void currentChannel(int channel) {
        if (isOn) {
            System.out.println("Current channel is " + channel);
        } else {
            throw new IllegalArgumentException("Please, turn TV ON");
        }

    }

    @Override
    public void upVolume() {
        if (isOn) {
            volumeLevel = volumeLevel++;
            System.out.println("You changed volume to " + volumeLevel);
        } else {
            throw new IllegalArgumentException("Please, turn TV ON");
        }
    }

    @Override
    public void downVolume() {
        if (isOn) {
            if (volumeLevel >=1) {
                volumeLevel = volumeLevel--;
                System.out.println("You changed volume to " + volumeLevel);
            } else {
                volumeLevel = 0;
                System.out.println("Volume is " + volumeLevel);
            }
        } else {
            throw new IllegalArgumentException("Please turn TV ON");
        }
    }

    @Override
    public void mute() {
        volumeLevel = 0;
        System.out.println("Mute");
    }
}

package com.company.fouthTask;

public class RemoteController implements Device, Volume{

    private TVDevice tvDevice;

    public RemoteController(TV tvDevice) {
        this.tvDevice = tvDevice;
    }


    @Override
    public void powerOn() {
        tvDevice.isOn = true;
        System.out.println("TV turned On");
    }

    @Override
    public void powerOff() {
        tvDevice.isOn = false;
        System.out.println("TV turned Off");
    }

    @Override
    public void setChannel(int channel) {
        if (tvDevice.isOn) {
            tvDevice.channelNumber = channel;
            System.out.println("You changed channel to " + channel);
        } else {
            throw new IllegalArgumentException("Please, turn TV ON to change channel");
        }
    }

    @Override
    public void currentChannel(int channel) {
        if (tvDevice.isOn) {
            System.out.println("Current channel is " + channel);
        } else {
            throw new IllegalArgumentException("Please, turn TV ON");
        }

    }

    @Override
    public void upVolume() {
        if (tvDevice.isOn) {
            tvDevice.volumeLevel = tvDevice.volumeLevel++;
            System.out.println("You changed volume to " + tvDevice.volumeLevel);
        } else {
            throw new IllegalArgumentException("Please, turn TV ON");
        }
    }

    @Override
    public void downVolume() {
        if (tvDevice.isOn) {
            if (tvDevice.volumeLevel >=1) {
                tvDevice.volumeLevel = tvDevice.volumeLevel--;
                System.out.println("You changed volume to " + tvDevice.volumeLevel);
            } else {
                tvDevice.volumeLevel = 0;
                System.out.println("Volume is " + tvDevice.volumeLevel);
            }
        } else {
            throw new IllegalArgumentException("Please turn TV ON");
        }
    }

    @Override
    public void mute() {
        tvDevice.volumeLevel = 0;
        System.out.println("Mute");
    }
}

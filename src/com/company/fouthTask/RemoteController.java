package com.company.fouthTask;

public class RemoteController implements Device, Volume {

    private TVDevice tvDevice = new TV();

    public RemoteController(TV tvDevice) {
        this.tvDevice = tvDevice;
    }

        @Override
        public void powerOn() {
            tvDevice.powerOn();
        }

        @Override
        public void powerOff() {
            tvDevice.powerOff();
        }

        @Override
        public void setChannel(int channel) {
            tvDevice.setChannel(channel);
        }

        @Override
        public void currentChannel() {
            tvDevice.currentChannel();
        }

        @Override
        public void upVolume() {
            tvDevice.upVolume();
        }

        @Override
        public void downVolume() {
            tvDevice.downVolume();
        }

        @Override
        public void mute() {
            tvDevice.mute();
        }

        public void connectDevice() {
            TVDevice tvDevice = new TV("LG", false, 10,10);
        }

        public void disconnectDevice() {
            tvDevice = null;
        }

        public void checkIfDeviceConnected() {
            if (tvDevice == null) {
                System.out.println("TVDevice is disconnected");
            } else {
                System.out.println("TVDevice is connected");
            }
        }
}
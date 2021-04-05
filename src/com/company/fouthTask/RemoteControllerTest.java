package com.company.fouthTask;

public class RemoteControllerTest {
        private static TV tv = new TV("Samsung", false, 0, 0);
        private static RemoteController remoteController = new RemoteController(tv);
    public static void main(String[] args) {
        remoteController.powerOn();
        remoteController.setChannel(10);
        remoteController.checkIfDeviceConnected();
        remoteController.disconnectDevice();
        remoteController.checkIfDeviceConnected();
        remoteController.connectDevice();
        remoteController.checkIfDeviceConnected();
    }
}

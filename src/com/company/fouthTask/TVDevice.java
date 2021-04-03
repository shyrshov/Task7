package com.company.fouthTask;

abstract class TVDevice implements Volume, Device{
    String modelName;
    boolean isOn;

    public TVDevice(String modelName, boolean isOn) {
        this.modelName = modelName;
        this.isOn = isOn;
    }

}

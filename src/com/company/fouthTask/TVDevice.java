package com.company.fouthTask;

abstract class TVDevice implements Volume, Device{
    protected String modelName;
    protected boolean isOn;

    public TVDevice () {

    }

    public TVDevice(String modelName, boolean isOn) {
        this.modelName = modelName;
        this.isOn = isOn;
    }

}

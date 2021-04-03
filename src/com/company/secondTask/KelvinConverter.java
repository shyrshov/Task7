package com.company.secondTask;

public class KelvinConverter implements Converter{
    double a;

    @Override
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}

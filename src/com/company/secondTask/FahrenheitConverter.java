package com.company.secondTask;

public class FahrenheitConverter implements Converter{
    @Override
    public double convert(double celsius) {
        return (9/5) * celsius + 32;
    }
}

package com.company.secondTask;

public class ConverterTest {
    private static double celsius = 20;

    public static void main(String[] args) {

        KelvinConverter kelvinConverter = new KelvinConverter();
        System.out.println("Conversion result of " + celsius + "celsius to kelvin = " + kelvinConverter.convert(celsius));

        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        System.out.println("Conversion result of " + celsius + "celsius to fahrenheit = " + fahrenheitConverter.convert(celsius));
    }
}

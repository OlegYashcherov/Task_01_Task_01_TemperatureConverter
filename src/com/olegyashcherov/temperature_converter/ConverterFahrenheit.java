package com.olegyashcherov.temperature_converter;

public class ConverterFahrenheit implements Converter {

    @Override
    public String convert(double temperatureCelsius) {
        double t = 9 / 5 * temperatureCelsius + 32;
        return "Температура " + temperatureCelsius + " по Цельсию равна " + t + " градусов по Фаренгейту";
    }
}

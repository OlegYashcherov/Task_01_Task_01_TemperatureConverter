package com.olegyashcherov.temperature_converter;

public class ConverterKelvin implements Converter {

    @Override
    public String convert(double temperatureCelsius) {
        double t = temperatureCelsius + 273.15;
        return "Температура " + temperatureCelsius + " по Цельсию равна " + t + " градусов по Келвину";
    }
}

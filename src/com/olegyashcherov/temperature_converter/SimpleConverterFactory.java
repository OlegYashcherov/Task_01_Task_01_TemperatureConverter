package com.olegyashcherov.temperature_converter;

public class SimpleConverterFactory {
    public static Converter createConverter(String type) {
        switch (type) {
            case "F":
                return new ConverterFahrenheit();
            case "K":
                return new ConverterKelvin();
            default:
                return null;
        }
    }
}

package com.olegyashcherov.temperature_converter;

@FunctionalInterface
public interface Converter {
    String convert(double temperatureCelsius);
}

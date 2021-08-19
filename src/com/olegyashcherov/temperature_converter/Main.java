package com.olegyashcherov.temperature_converter;

import java.util.Scanner;

public class Main {

    private static final String FAHRENHEIT = "F";
    private static final String KELVIN = "K";
    private static final String INITIAL_MESSAGE = "\nДля перевода градусов Цельсия введите:\n" +
            "F - в градусы по Фаренгейту\n" +
            "K - в градусы по Келвину,\n" +
            "или любой символ для выхода из программы\n";
    private static final String ERROR_MESSAGE = "\nНеверное значение, попробуйте ещё раз";

    private static Scanner scanner;

    public static void main(String[] args) {

        run();

        if (scanner != null) {
            scanner.close();
        }
    }


    private static void run() {

        scanner = new Scanner(System.in);

            System.out.println(INITIAL_MESSAGE);
            String type = scanner.nextLine().toUpperCase();
            if (FAHRENHEIT.equals(type) || KELVIN.equals(type)) {
                convert(type);
            }
    }

    private static void convert(String typeConvert) {
        String s = "\nВведите градусы по Цельсию:\n";
        System.out.println(s);
        if (scanner.hasNextDouble()) {
            Converter converter = SimpleConverterFactory.createConverter(typeConvert);
            String result = converter.convert(scanner.nextDouble());
            System.out.println(result + "\n******************************************************************\n");
        } else {
            System.out.println(ERROR_MESSAGE);
        }
        run();
    }
}

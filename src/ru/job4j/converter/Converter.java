package ru.job4j.converter;
//Метод реализован согласно условиям задачи, но результат не корректен поскольку целочисленный
// тип метода, аргумента и переменной rsl не дает реальной конвертации валюты
//решение с тестами в комментариях верно, но не отвечает начальным условиям задачи (тип)
public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return  value / 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        int out2 = Converter.rubleToDollar(in);
        boolean passed2 = expected == out2;
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        System.out.println("140 rubles are " + dollar + " dollar");
        System.out.println("140 rubles are 2 dollar. Test result : " + passed2);
    }
}
/*
public class Converter {
    public static double rubleToEuro(double value) {
        return value / 70;
    }

    public static double rubleToDollar(double value) {
        return  value / 60;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(140);
        double dollar = Converter.rubleToDollar(180);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("140 rubles are " + dollar + " dollar");

        double inEuro = 140;
        double expectedEuro = 2.0;
        double outEuro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2 euro. Test result : " + passedEuro);

        double inDollar = 150;
        double expectedDollar = 2.5;
        double outDollar = Converter.rubleToDollar(inDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("150 rubles are 2.5 dollar . Test result : " + passedDollar);

    }
}
*/

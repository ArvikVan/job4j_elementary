package ru.job4j.converter;
//Метод реализован согласно условиям задачи, но результат не корректен поскольку целочисленный
// тип метода, аргумента и переменной rsl не дает реальной конвертации валюты
public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return  value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("140 rubles are " + dollar + " dollar");
    }
}

/*public class Converter {
    public static double rubleToEuro(double value){
        return value / 70;
    }
    public static double rubleToDollar(double value){
        return  value / 60;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(140);
        double dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + euro + " euro");
        System.out.println("140 rubles are " + dollar + " dollar");
    }
}*/

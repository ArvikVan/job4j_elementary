package ru.job4j.array;
//3. Метод должен проверить, что все элементы в массиве являются true или false.
public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = data[0];
        for (int i = 0; i < data.length; i++) {
                if (data[i] != result) {
                    return false;
                }
        }
        return true;
    }
}



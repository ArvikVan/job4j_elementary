package ru.job4j.array;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        int mult = 1;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                mult = i * j;
                table[i - 1][j - 1] = mult;
            }
        }
        return table;
    }
}
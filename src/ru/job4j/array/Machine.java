package ru.job4j.array;
import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100]; //массив для хранения монет
        int size = 0; //индекс rsl 
        int ost = money - price;
            for (int i = 0; i < coins.length; i++) {
                while (ost - coins[i] >= 0) {
                    rsl[size] = coins[i];
                    ost -= coins[i];
                    size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}

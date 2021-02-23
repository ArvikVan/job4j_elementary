package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3() {
        int[] input = new int[] {1, 2, 3, 4};
        int[] expect = new int[] {4, 2, 3, 1};
        int[] rsl = SwitchArray.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap1To5() {
        int[] input = new int[] {1, 9, 3, 4, 4, 2, 8};
        int[] expect = new int[] {1, 2, 3, 4, 4, 9, 8};
        int[] rsl = SwitchArray.swap(input, 1, input.length - 2);
        assertThat(rsl, is(expect));
    }

    @Test
    public void whenSwap2To4() {
        int[] input = new int[] {1, 9, 3, 4, 4, 2, 8};
        int[] expect = new int[] {1, 9, 4, 4, 3, 2, 8};
        int[] rsl = SwitchArray.swap(input, 2, input.length - 3);
        assertThat(rsl, is(expect));
    }
}
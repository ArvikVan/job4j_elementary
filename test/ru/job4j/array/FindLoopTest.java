package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = new int[] {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas4Then1() {
        int[] input = new int[] {5, 4, 3, 2};
        int value = 4;
        int result = FindLoop.indexOf(input, value);
        int expect = 1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas7ThenNotFound() {
        int[] input = new int[] {5, 4, 3, 2};
        int value = 7;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotFind7() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 7;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}
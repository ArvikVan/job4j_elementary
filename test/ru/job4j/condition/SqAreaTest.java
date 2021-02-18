package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2then2() {
        int p = 6;
        int k = 2;
        double expected = 2.0;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP6K4Then144() {
        int p = 6;
        int k = 4;
        double expected = 1.44;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K4Then256() {
        int p = 8;
        int k = 4;
        double expected = 2.56;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K2Then555() {
        int p = 10;
        int k = 2;
        double expected = 5.55;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}
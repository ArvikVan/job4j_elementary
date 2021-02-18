package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        int expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when02To20Then28() {
        int x1 = 0;
        int y1 = 2;
        int x2 = 2;
        int y2 = 0;
        double expected = 2.82;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42To25Then36() {
        int x1 = 4;
        int y1 = 2;
        int x2 = 2;
        int y2 = 5;
        double expected = 3.6;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when42To2Then316() {
        int x1 = 4;
        int y1 = 2;
        int x2 = 1;
        int y2 = 1;
        double expected = 3.16;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To52Then538() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 2;
        double expected = 5.38;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
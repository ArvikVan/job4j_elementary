package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenConvert180RblThen3Dollars() {
        int in = 180;
        int expected = 3;
        int out2 = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out2);
    }
}
/*
public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        double temp = 0;
        double in = 140.0;
        double expected = 2.0;
        double out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, temp);
    }

    @Test
    public void whenConvert180RblThen3Dollars() {
        double temp = 0;
        double in = 180;
        double expected = 3;
        double out2 = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out2, temp);
    }
}*/

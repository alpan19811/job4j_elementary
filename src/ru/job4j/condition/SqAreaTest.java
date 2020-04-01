package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {
    @Test
    public void distance() {
        double result1 = SqArea.square(7, 2);
        double expected = 2;
        Assert.assertEquals(expected, result1, 0.01);
    }
}
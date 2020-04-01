package ru.job4j.condition;

        import org.junit.Assert;
        import org.junit.Test;

public class PointTest {
    @Test
    public void distance() {
        double result = Point.distance(0, 0, 0, 10);;
        double expected = 10;
        Assert.assertEquals(expected, result, 0.01);
    }
    @Test
    public void venresult2() {
        double result = Point.distance(0, 0, 0, 5);;
        double expected = 5;
        Assert.assertEquals(expected, result, 0.01);
    }
    @Test
    public void venresult3() {
        double result = Point.distance(2, 2, 4, 6);
        double expected = 4.47;
        Assert.assertEquals(expected, result, 0.01);
    }
}

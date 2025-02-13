package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas55Then4() {
        int[] data = {14, 6, 9, 98, 55, 12};
        int el = 55;
        int result = FindLoop.indexOf(data, el);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasNo22ThenMinus1() {
        int[] data = {11, 33, 44, 55, 66};
        int el = 22;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasLength5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind8() {
        int[] data = new int[] {5, 2, 10, 2, 4, 12, 223, 421, 700};
        int el = 700;
        int start = 5;
        int finish = 8;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 8;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNotFound() {
        int[] data = new int[] {5, 2, 10, 2, 4, 12, 223, 421, 700};
        int el = 700;
        int start = 0;
        int finish = 6;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}
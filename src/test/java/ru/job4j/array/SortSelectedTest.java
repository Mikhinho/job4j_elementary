package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortOf3() {
        int[] data = new int[] {99, 44, 88};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {44, 88, 99};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortOf5() {
        int[] data = new int[] {99, 44, 88, 12, 52};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {12, 44, 52, 88, 99};
        Assert.assertArrayEquals(expected, result);
    }
}
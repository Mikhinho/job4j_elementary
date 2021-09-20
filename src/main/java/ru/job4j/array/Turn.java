package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int tmp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = tmp;
        if (array.length > 2) {
            for (int i = 1; i < array.length / 2; i++) {
               tmp = array[i];
               array[i] = array[array.length - i - 1];
               array[array.length - i - 1] = tmp;
            }
        }
        return array;
    }
}
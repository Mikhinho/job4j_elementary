package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int left = 3;
        int right = 3;
        System.out.println(max(left, right));
    }
}

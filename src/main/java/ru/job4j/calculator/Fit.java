package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = height - 88;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = height - 101;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
    }
}

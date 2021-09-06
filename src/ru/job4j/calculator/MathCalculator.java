package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double substAndDiv(double first, double second) {
        return subst(first, second)
                + div(first, second);
    }

    public static double sumAll(double first, double second) {
        return subst(first, second) + div(first, second) + sum(first, second) + multiply(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета (вычитание + деление) равен: " + substAndDiv(10, 20));
        System.out.println("Результат расчета (сумма всех операций) равен: " + sumAll(10, 20));
    }
}

package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
         if (count <= 2) {
             if (number % i == 0) {
                 count++;
             }
         } else {
             break;
         }
        }
        return count % 2 == 0 && count != 0;
    }
}

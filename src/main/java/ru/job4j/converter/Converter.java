package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60; /* формула перевода рублей в доллары. */
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expectedEuro = 2.0f;
        float expectedBucks = 2.3333333f;
        float outEuro = Converter.rubleToEuro(in);
        float outBucks = Converter.rubleToDollar(in);
        boolean passedEuro = expectedEuro == outEuro;
        boolean passedBucks = expectedBucks == outBucks;
        System.out.println("140 rubles are " + outEuro + " euro. Test result: " + passedEuro + ". 140 rubles are " + outBucks + " dollars. Test result: " + passedBucks);
    }
}

package ru.job4j.condition;

public class ChessBoard {

    public static boolean inRange(int coord) {
        return coord >=0 && coord <=7;
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (inRange(x1) && inRange(x2) && inRange(y1) && inRange(y2) && Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            rsl = Math.abs(x2 - x1);
        }
        return rsl;
    }
}

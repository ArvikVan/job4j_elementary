package ru.job4j.condition;

public class ChessBoard {
    public static int elephantWay(int x1, int y1, int x2, int y2) {
        return (Math.abs(x1 - x2) == Math.abs(y1 - y2)) ? Math.abs(x1 - x2) : 0;
    }

    public static void main(String[] args) {
        int rsl = ChessBoard.elephantWay(6, 7, 1, 2);
        System.out.println(rsl);
    }
/*   public static  int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if ((x1 == x2) || (y1 == y2)) {
            rsl = Math.abs(x2 - x1);
            rsl = rsl == 0 ? Math.abs(y2 - y1) : rsl;
        }
        return rsl;
    }
*/
}


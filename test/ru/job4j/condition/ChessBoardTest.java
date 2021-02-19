package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ChessBoardTest {

    @Test
    public void wayIs6() {
        int way = ChessBoard.elephantWay(6, 7, 1, 2);
        assertThat(way, is(5));
    }

    @Test
    public void wayIs5() {
        int way = ChessBoard.elephantWay(7, 0, 0, 7);
        assertThat(way, is(7));
    }

    @Test
    public void wayIs0() {
        int way = ChessBoard.elephantWay(2, 6, 4, 1);
        assertThat(way, is(0));
    }

   /* @Test
    public void wayIs6() {
        int way = ChessBoard.way(0, 0, 0, 6);
        assertThat(way, is(6));
    }

    @Test
    public void wayIs5() {
        int way = ChessBoard.way(0, 0, 5, 0);
        assertThat(way, is(5));
    }

    @Test
    public void wayIs0() {
        int way = ChessBoard.way(0, 0, 5, 6);
        assertThat(way, is(0));
    }*/
}
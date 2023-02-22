package ru.vsu.cs.Grushevskaya;

import java.util.ArrayList;
import java.util.List;

public class Field {
    private List<Checker> player1Checkers; // 12
    private List<Checker> player2Checkers;

    private final int fieldSize = 8;

    public int getFieldSize() {
        return fieldSize;
    }

    public Field() {
        List<Checker> temp1 = new ArrayList<>();
        temp1.add(new Checker(0, 1));
        temp1.add(new Checker(0, 3));
        temp1.add(new Checker(0, 5));
        temp1.add(new Checker(0, 7));
        temp1.add(new Checker(1, 0));
        temp1.add(new Checker(1, 2));
        temp1.add(new Checker(1, 4));
        temp1.add(new Checker(1, 6));
        temp1.add(new Checker(2, 1));
        temp1.add(new Checker(2, 3));
        temp1.add(new Checker(2, 5));
        temp1.add(new Checker(2, 7));
        this.player1Checkers = temp1;

        List<Checker> temp2 = new ArrayList<>();
        temp2.add(new Checker(5, 0));
        temp2.add(new Checker(5, 2));
        temp2.add(new Checker(5, 4));
        temp2.add(new Checker(5, 6));
        temp2.add(new Checker(6, 1));
        temp2.add(new Checker(6, 3));
        temp2.add(new Checker(6, 5));
        temp2.add(new Checker(6, 7));
        temp2.add(new Checker(7, 0));
        temp2.add(new Checker(7, 2));
        temp2.add(new Checker(7, 4));
        temp2.add(new Checker(7, 6));
        this.player2Checkers = temp2;
    }

    public List<Checker> getPlayer1Checkers() {
        return player1Checkers;
    }

    public void setPlayer1Checkers(List<Checker> player1Checkers) {
        this.player1Checkers = player1Checkers;
    }

    public List<Checker> getPlayer2Checkers() {
        return player2Checkers;
    }

    public void setPlayer2Checkers(List<Checker> player2Checkers) {
        this.player2Checkers = player2Checkers;
    }
}

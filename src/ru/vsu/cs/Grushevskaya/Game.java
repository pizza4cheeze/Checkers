package ru.vsu.cs.Grushevskaya;

import java.util.List;

public class Game {
    private Player firstPlayer;
    private Player secondPlayer;

    private Field field;
    private GameState state;

    public Field getField() {
        return field;
    }

    public GameState getState() {
        return state;
    }

    public Game(Player firstPlayer, Player secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.field = new Field();
        this.state = GameState.FIRST_PLAYER_MOVE;
    }

    public Checker findCheckerByCoordinate(Coordinate coordinate, GameState state) {
        if (state == GameState.FIRST_PLAYER_MOVE) {
            for (Checker checker : field.getPlayer1Checkers()) {
                if (checker.getCoordinate().getRow() == coordinate.getRow() && checker.getCoordinate().getCol() == coordinate.getCol()) {
                    return checker;
                }
            }
        }
        else if (state == GameState.SECOND_PLAYER_MOVE) {
            for (Checker checker : field.getPlayer2Checkers()) {
                if (checker.getCoordinate().getRow() == coordinate.getRow() && checker.getCoordinate().getCol() == coordinate.getCol()) {
                    return checker;
                }
            }
        }
        return null;
    }

    public Player getFirstPlayer() {
        return firstPlayer;
    }

    public Player getSecondPlayer() {
        return secondPlayer;
    }

    public boolean makeMove(GameState state, Coordinate checker, Coordinate delta) {
        List<Checker> currCheckers;
        if (state == GameState.FIRST_PLAYER_MOVE) {
            currCheckers = field.getPlayer1Checkers();
        } else currCheckers = field.getPlayer2Checkers();

//        Checker currChecker;
        Coordinate pointChecker = new Coordinate(checker.getRow() + delta.getRow(), checker.getCol() + delta.getCol());


//        for (Checker checkerList : currCheckers) {
//            if (checker.getRow() == checkerList.getRow() && checker.getCol() == checkerList.getCol()) {
//                currChecker = checkerList;
//                break;
//            }
//        }


        return true;
    }
}

package ru.vsu.cs.Grushevskaya;

import javax.crypto.spec.PSource;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Привет, шашечник, епта. Назовись кто такой, ебанат");
        Player player1Rovniy = new Player(sc.nextLine());

        System.out.println("Привет, хуесос, епта. Назовись кто такой, ебанат");
        Player player2Huesos = new Player(sc.nextLine());

        Game game = new Game(player1Rovniy, player2Huesos);

        while (game.getState() != GameState.END) {
            printField(game.getField());
            if (game.getState() == GameState.FIRST_PLAYER_MOVE) {

                System.out.println("ходи уже, " + game.getFirstPlayer().getName() + ", че дурной чтоли");
                Coordinate currCoord = GameUtils.strToCoord(sc.nextLine());

                Checker currChecker = game.findCheckerByCoordinate(currCoord, game.getState());
                while (currChecker == null) {
                    System.out.println("ты ебаный лох шашки такой нет введи еще раз");
                    currChecker = game.findCheckerByCoordinate(GameUtils.strToCoord(sc.nextLine()), game.getState());
                }

                Coordinate delta = new Coordinate(0, 0);
                System.out.println("если хотите сходить влево, введите 1, вправо - 2");
                String desigion = sc.nextLine();
                while (desigion != "1" || desigion != "2") {
                    System.out.println("недопустимая ячейка. попробуйте снова");
                    desigion = sc.nextLine();
                }
                if (Objects.equals(desigion, "1")) {
                    System.out.println("введите количество клеток по диагонали, на которое хотите подвинуть шашку");
                    int amount = Character.getNumericValue(sc.nextLine().charAt(0));
                    while (currChecker.getIsKing() == CheckerState.USUAL && amount > 2) {
                        System.out.println("недопустимая ячейка. попробуйте снова");
                        amount = Character.getNumericValue(sc.nextLine().charAt(0));
                    }
                    delta = new Coordinate(-amount, -amount);
                } else {
                    System.out.println("введите количество клеток по диагонали, на которое хотите подвинуть шашку");
                    int amount = Character.getNumericValue(sc.nextLine().charAt(0));
                    while (currChecker.getIsKing() == CheckerState.USUAL && amount > 2) {
                        System.out.println("недопустимая ячейка. попробуйте снова");
                        amount = Character.getNumericValue(sc.nextLine().charAt(0));
                    }
                    delta = new Coordinate(-amount, amount);
                }
                game.makeMove(game.getState(), currCoord, delta);
                
                // todo: сходить полученной шашкой, поменять state игры, распечатать поле в консоль
                // todo: бот
            }
        }
    }

    public static void printField(Field field) {
        System.out.println("  abcd efgh");
        for (int row = 0; row < field.getFieldSize(); row++) {
            System.out.print(row + " ");
            for (int col = 0; col < field.getFieldSize(); col++) {
                char curr = 's';
                for (Checker checker : field.getPlayer1Checkers()) {
                    if (checker.getRow() == row && checker.getCol() == col) {
                        if (checker.getIsKing() == CheckerState.KING) {
                            curr = '✰';
                        } else {
                            curr = '○';
                        }
                    }
                }
                if (curr == 's') {
                    for (Checker checker : field.getPlayer2Checkers()) {
                        if (checker.getRow() == row && checker.getCol() == col) {
                            if (checker.getIsKing() == CheckerState.KING) {
                                curr = '★';
                            } else {
                                curr = '●';
                            }
                        }
                    }
                }
                if (curr == 's') {
                    System.out.print("_");
                } else {
                    System.out.print(curr);
                }
            }
            System.out.println();
        }
    }
}

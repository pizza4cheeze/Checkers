package ru.vsu.cs.Grushevskaya;

public class GameUtils {
    public static Coordinate strToCoord(String str) {
        // a5
        int column;
        int row;

        switch (str.charAt(0)) {
            case 'A', 'a', 'А', 'а', '0' -> column = 0;
            case 'Б', 'б', '1' -> column = 1;
            case 'В', 'в', 'B', 'b', '2' -> column = 2;
            case 'Г', 'г', '3' -> column = 3;
            case 'Д', 'д', '4' -> column = 4;
            case 'Е', 'е', 'E', 'e', '5' -> column = 5;
            case 'Ж', 'ж', '6' -> column = 6;
            case 'З', 'з', '7' -> column = 7;
            default -> {
                return null;
            }
        }
        row = Character.getNumericValue(str.charAt(1));

        return new Coordinate(row, column);
    }
}

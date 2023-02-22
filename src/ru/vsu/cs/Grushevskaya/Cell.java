package ru.vsu.cs.Grushevskaya;

public class Cell {
    private final int row;
    private final int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public Cell(Coordinate coordinate) {
        this.row = coordinate.getRow();
        this.col = coordinate.getCol();
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
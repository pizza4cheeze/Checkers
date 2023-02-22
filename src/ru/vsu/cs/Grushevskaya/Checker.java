package ru.vsu.cs.Grushevskaya;

public class Checker {
    private Cell coordinate;
    private CheckerState isKing;

    public Checker(Cell coordinate) {
        this.coordinate = coordinate;
        this.isKing = CheckerState.USUAL;
    }

    public Checker(int row, int col) {
        this.coordinate = new Cell(new Coordinate(row, col));
    }

    public int getRow() {
        return coordinate.getRow();
    }

    public int getCol() {
        return coordinate.getCol();
    }

    public Cell getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Cell coordinate) {
        this.coordinate = coordinate;
    }

    public CheckerState getIsKing() {
        return isKing;
    }

    public void setIsKing(CheckerState isKing) {
        this.isKing = isKing;
    }
}

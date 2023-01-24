package lesson3task1;

public class Cinema {
    private final int number;
    private final int rowNumber;
    private boolean isFree;

    public Cinema(int number, int rowNumber, boolean isFree) {
        this.number = number;
        this.rowNumber = rowNumber;
        this.isFree = isFree;
    }

    public int getNumber() {
        return number;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }
}

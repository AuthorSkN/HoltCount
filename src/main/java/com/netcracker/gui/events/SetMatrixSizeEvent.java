package com.netcracker.gui.events;

public class SetMatrixSizeEvent {

    private final int rowCount;
    private final int columnCount;

    public SetMatrixSizeEvent(int rowCount, int columnCount) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }

    public int getRowCount() {
        return rowCount;
    }

    public int getColumnCount() {
        return columnCount;
    }
}

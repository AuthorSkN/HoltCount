package com.netcracker.model;

import com.netcracker.excaption.*;

public class ImageMatrixModelImpl implements ImageMatrixModel{

    private int rowCount;
    private int columnCount;
    private boolean[][] matrix = null;

    @Override
    public boolean[][] getMatrix() {
        return matrix;
    }

    @Override
    public boolean[][] createMatrix() {
        if ((rowCount != -1)&&(columnCount != -1))
        {
            return new boolean[rowCount][columnCount];
        }
        else
        {
            throw new HoltCountException();
        }
    }

    @Override
    public int getRowCount() {
        return rowCount;
    }

    @Override
    public void setRowCount(int rowCount) {
        if (matrix != null)
        {
            throw new HoltCountException();
        }
        this.rowCount = rowCount;
    }

    @Override
    public int getColumnCount() {
        return columnCount;
    }

    @Override
    public void setColumnCount(int columnCount) {
        if (matrix != null)
        {
            throw new HoltCountException();
        }
        this.columnCount = columnCount;
    }
}

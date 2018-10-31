package com.netcracker.model;

public interface ImageMatrixModel  {

    boolean[][] getMatrix();

    boolean[][] createMatrix();

    int getRowCount();

    void setRowCount(int rowCount);

    int getColumnCount();

    void setColumnCount(int columnCount);
}

package com.netcracker.model;

public class ImageMatrix {

    private final int rowCount;
    private final int columnCount;

    private final boolean[][] matrix;

    public ImageMatrix(int rowCount, int columnCount, boolean[][] matrix) {
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.matrix = matrix;
    }
}

package org.academiadecodigo.bootcamp.gfx.simplegfx;

import org.academiadecodigo.bootcamp.grid.Grid;
import org.academiadecodigo.bootcamp.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SimpleGfxGrid implements Grid {

    public static final int PADDING = 10;

    private int cols;
    private int rows;
    private int cellSize;

    Rectangle grid = new Rectangle();


    public SimpleGfxGrid(int cols, int rows){

        this.cellSize = 10;
        this.cols = cols;
        this.rows = rows;

        //throw new UnsupportedOperationException();
    }

    /**
     * @see Grid#init()
     */
    @Override
    public void init() {

        grid = new Rectangle(PADDING,PADDING, cols*cellSize, rows*cellSize);
        grid.draw();

        //throw new UnsupportedOperationException();
    }

    /**
     * @see Grid#getCols()
     */
    @Override
    public int getCols() {
        return cols;

        //throw new UnsupportedOperationException();
    }

    /**
     * @see Grid#getRows()
     */
    @Override
    public int getRows() {
        return rows;

        //throw new UnsupportedOperationException();
    }

    /**
     * Obtains the width of the grid in pixels
     * @return the width of the grid
     */
    public int getWidth() {
        return grid.getWidth();

        //throw new UnsupportedOperationException();
    }

    /**
     * Obtains the height of the grid in pixels
     * @return the height of the grid
     */
    public int getHeight() {
        return grid.getHeight();

        //throw new UnsupportedOperationException();
    }

    /**
     * Obtains the grid X position in the SimpleGFX canvas
     * @return the x position of the grid
     */
    public int getX() {
        return grid.getX();

        //throw new UnsupportedOperationException();
    }

    /**
     * Obtains the grid Y position in the SimpleGFX canvas
     * @return the y position of the grid
     */
    public int getY() {
        return grid.getY();
        //throw new UnsupportedOperationException();
    }

    /**
     * Obtains the pixel width and height of a grid position
     * @return
     */
    public int getCellSize() {
        return cellSize;
        //throw new UnsupportedOperationException();
    }

    /**
     * @see Grid#makeGridPosition()
     */
    @Override
    public GridPosition makeGridPosition() {
        return new SimpleGfxGridPosition(this);
        //throw new UnsupportedOperationException();
    }

    /**
     * @see Grid#makeGridPosition(int, int)
     */
    @Override
    public GridPosition makeGridPosition(int col, int row) {
        return new SimpleGfxGridPosition(col, row, this);
        //throw new UnsupportedOperationException();
    }

    /**
     * Auxiliary method to compute the y value that corresponds to a specific row
     * @param row index
     * @return y pixel value
     */
    public int rowToY(int row) {
        return row*cellSize;
        //throw new UnsupportedOperationException();
    }

    /**
     * Auxiliary method to compute the x value that corresponds to a specific column
     * @param column index
     * @return x pixel value
     */
    public int columnToX(int column) {
        return column*cellSize;
        //throw new UnsupportedOperationException();
    }
}

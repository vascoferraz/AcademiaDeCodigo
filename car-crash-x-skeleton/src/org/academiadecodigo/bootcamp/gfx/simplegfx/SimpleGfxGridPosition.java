package org.academiadecodigo.bootcamp.gfx.simplegfx;

import com.googlecode.lanterna.gui.GUIScreen;
import org.academiadecodigo.bootcamp.grid.GridColor;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.position.AbstractGridPosition;
import org.academiadecodigo.bootcamp.grid.position.GridPosition;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.graphics.Shape;

/**
 * Simple graphics position
 */
public class SimpleGfxGridPosition extends AbstractGridPosition {

    private Rectangle rectangle;
    private SimpleGfxGrid grid;

    /**
     * Simple graphics position constructor
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(SimpleGfxGrid grid){
        super((int) (Math.random() * grid.getCols()), (int) (Math.random() * grid.getRows()), grid);
        this.grid = grid;
        rectangle= new Rectangle( grid.columnToX(this.getCol()) + grid.PADDING, grid.rowToY(this.getRow()) + grid.PADDING, grid.getCellSize(), grid.getCellSize());

        show();
        //throw new UnsupportedOperationException();
    }

    /**
     * Simple graphics position constructor
     * @param col position column
     * @param row position row
     * @param grid Simple graphics grid
     */
    public SimpleGfxGridPosition(int col, int row, SimpleGfxGrid grid){
        super(col, row, grid);
        this.grid = grid;
        rectangle= new Rectangle( grid.columnToX(this.getCol()) + grid.PADDING, grid.rowToY(this.getRow()) + grid.PADDING, grid.getCellSize(), grid.getCellSize());

        show();
        //throw new UnsupportedOperationException();
    }

    /**
     * @see GridPosition#show()
     */
    @Override
    public void show() {
        rectangle.draw();
        rectangle.fill();
        rectangle.setColor(Color.BLUE);

        //throw new UnsupportedOperationException();
    }

    /**
     * @see GridPosition#hide()
     */
    @Override
    public void hide() {
        rectangle.delete();
        //throw new UnsupportedOperationException();
    }

    /**
     * @see GridPosition#moveInDirection(GridDirection, int)
     */
    @Override
    public void moveInDirection(GridDirection direction, int distance) {

        int xx = grid.columnToX(getCol());
        int yy = grid.rowToY(getRow());
        super.moveInDirection(direction,distance);
        int x = grid.columnToX(getCol());
        int y = grid.rowToY(getRow());

        rectangle.translate(x-xx, y-yy);

        //throw new UnsupportedOperationException();
    }

    /**
     * @see AbstractGridPosition#setColor(GridColor)
     */
    @Override
    public void setColor(GridColor color) {

        super.setColor(color);

        rectangle.setColor(SimpleGfxColorMapper.getColor(color));

        //throw new UnsupportedOperationException();
    }
}

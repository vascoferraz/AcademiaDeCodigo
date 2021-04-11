package org.academiadecodigo.bootcamp.gfx.lanterna;

import org.academiadecodigo.bootcamp.grid.GridColor;
import org.academiadecodigo.bootcamp.grid.GridDirection;
import org.academiadecodigo.bootcamp.grid.position.AbstractGridPosition;
import org.academiadecodigo.bootcamp.grid.position.GridPosition;

/**
 * A GridPosition implementation for the Lanterna based Grid
 */
public class LanternaGridPosition extends AbstractGridPosition {

    /**
     * Construct a new random grid position
     *
     * @param grid  the grid where the position will live on
     */
    public LanternaGridPosition(LanternaGrid grid) {

        super((int) (Math.random() * grid.getCols()), (int) (Math.random() * grid.getRows()), grid);
        show();

    }

    /**
     * Creates a new grid position at a specific column and row
     *
     * @param col   the grid position column
     * @param row   the  grid position row
     * @param grid  the grid where the position will live on
     */
    public LanternaGridPosition(int col, int row, LanternaGrid grid) {

        super(col, row, grid);
        show();

    }

    /**
     * @see GridPosition#show()
     */
    @Override
    public void show() {
        ((LanternaGrid) getGrid()).show(this);
    }

    /**
     * @see GridPosition#hide()
     */
    @Override
    public void hide() {
        ((LanternaGrid) getGrid()).hide(this);
    }

    /**
     * @see GridPosition#moveInDirection(GridDirection, int)
     */
    @Override
    public void moveInDirection(GridDirection direction, int distance) {

        hide();
        super.moveInDirection(direction, distance);
        show();

    }

}

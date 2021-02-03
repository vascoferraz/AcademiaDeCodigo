package org.academiadecodigo.carcrash.field;

public class Position {

    private int x;
    private int y;

    public Position (int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int random = (int) (Math.random() * 2);

    public int getCol() { return x; }

    public int getRow() { return y; }

    public void setCol() { x = nextX(); }

    public void setRow() { y = nextY(); }


    public int nextX() {

        // Right
        if (random == 0 && x < Field.getWidth()-1) {
            x = x +1;
        }

        // Left
        if (random == 1 && x > 0) {
            x = x -1;
        }
        else {random = (int) (Math.random() * 2);}
        return x;
    }

    public int nextY() {

        if (random == 0 && y < Field.getHeight()-1) {
            y = y + 1;
        }

        if (random == 1 && y > 0) {
            y = y - 1;
        }
        else {random = (int) (Math.random() * 2);}
        return y;
    }

}




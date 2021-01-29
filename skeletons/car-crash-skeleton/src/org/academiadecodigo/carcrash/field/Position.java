package org.academiadecodigo.carcrash.field;

public class Position {

    private int x = (int) (Math.random() * Field.getWidth());
    private int y = (int) (Math.random() * Field.getHeight());
    int random;

    public int getCol() {
        return x;
    }

    public int getRow() { return y; }

    public void setCol() {
        this.x = nextX();
    }

    public void setRow() { this.y = nextY(); }


    public int nextX() {

        random = (int) (Math.random() * 2);

        if (random == 0 && x < Field.getWidth()-1) {
            this.x = x + 1;
        }

        if (random == 1 && x > 1) {
            this.x = x - 1;
        }

        return this.x;
    }

    public int nextY() {

        random = (int) (Math.random() * 2);

        if (random == 0 && y < Field.getHeight()-1) {
            this.y = y + 1;
        }

        if (random == 1 && y > 1) {
            this.y = y - 1;
        }

        return this.y;
    }

}




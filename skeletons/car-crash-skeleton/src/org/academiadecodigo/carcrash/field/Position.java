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

    public void setCol(int speed) { x = nextX(speed); }

    public void setRow(int speed) { y = nextY(speed); }


    public int nextX(int speed) {

        // Right
        if (random == 0 && x < Field.getWidth()-speed) {
            x = x + speed;
        }

        // Left
        if (random == 1 && x > speed-1) {
            x = x - speed;
        }
        return x;
    }

    public int nextY(int speed) {

        if (random == 0 && y < Field.getHeight()-speed) {
            y = y + speed;
        }

        if (random == 1 && y > speed-1) {
            y = y - speed;
        }
        else  {random = (int) (Math.random() * 2);}
        return y;
    }

}




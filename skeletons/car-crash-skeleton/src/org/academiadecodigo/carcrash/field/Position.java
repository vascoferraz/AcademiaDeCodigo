package org.academiadecodigo.carcrash.field;

public class Position {

    private int x = (int) (Math.random() * 100);
    private int y = (int) (Math.random() * 25);
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

        if (random == 0 && x < 4) {
            this.x = x + 1;
            System.out.println("x: " + this.x);
        }

        if (random == 1 && x > 1) {
            this.x = x - 1;
            System.out.println("x: " + this.x);
        }

        return this.x;
    }

    public int nextY() {

        random = (int) (Math.random() * 2);

        if (random == 0 && y < 4) {
            this.y = y + 1;
            System.out.println("y: " + this.y);
        }

        if (random == 1 && y > 1) {
            this.y = y - 1;
            System.out.println("y: " + this.y);
        }

        return this.y;
    }

}




package org.academiadecodigo.carcrash.field;

public class Position {

    private int x = (int) (Math.random() * 100);
    private int y = (int) (Math.random() * 25);
    int random;

    public int getCol() {
        return x;
    }

    public int getRow() {
        return y;
    }

    public void setCol() {
        this.x = nextX();
    }

    public void setRow() {
        this.y = nextY();
    }

    public int nextX() {

        if (random == 0) {
            this.x = this.x+1;
            System.out.println(this.x);
        }

        if (random == 1) {
            this.x = this.x-1;
            System.out.println(this.x);
        }
        random = (int) (Math.random() * 2);
        return this.x;
    }

    public int nextY() {

        if (random == 0) {
            this.y = this.y+1;
            System.out.println(this.x);
        }

        if (random == 1) {
            this.y = this.y-1;
            System.out.println(this.y);
        }
        random = (int) (Math.random() * 2);
        return this.y;
    }

}




package org.academiadecodigo.bootcamp56.rockpaperscissors;

public enum Random {

    ROCK("Rock"),
    PAPER("Paper"),
    SCISSOR("Scissor");

    private String type;

    private Random (String type) {
        this.type = type;
    }

    public static int getType () {

        int type = (int)Math.ceil(Math.random() * 3);
        return type;
    }

}

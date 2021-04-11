package org.academiadecodigo.bootcamp56.arabian-nigths;

public class Genie {

    private int wishes;

    public Genie() {
    }

    public void grantWish (String wish) {

        wishes--;

        if (wishes < 0)
        { System.out.println("No more wishes available"); }

        else { System.out.println("Your wish " + wish + " was granted"); }
    }
}


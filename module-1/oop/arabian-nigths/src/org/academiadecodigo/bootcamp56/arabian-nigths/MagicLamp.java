package org.academiadecodigo.bootcamp56.arabian-nigths;

import java.lang.reflect.Array;

public class MagicLamp {

    private int maxGenies;
    private Genie[] genies;

    public MagicLamp(int maxGenies) {
        this.maxGenies = maxGenies;
        genies = new Genie[maxGenies];
    }

    public void createGenies() {

        for (int i = 0 ; i <= maxGenies-1; i++) {

            if (i == maxGenies-1) {
                genies[i] = new RecyclableDemon();
                continue;
            }

            if (i % 2 == 1) {
                genies[i] = new GrumpyGenie();
                continue;
            }

            if (i % 2 == 0 ) {
                genies[i] = new FriendlyGenie();

            }
        }

    }

    public void rubLamp(int rub) {


            if (i == maxGenies - 1) {
                genies[i] = new RecyclableDemon();
                System.out.println("Invoked Recyclable genie | Number: " + i);
            }

            if (i % 2 == 1) {
                genies[i] = new GrumpyGenie();
                System.out.println("Invoked Grumpy genie | Number: " + i);
            }

            if (i % 2 == 0 && i != maxGenies - 1) {
                genies[i] = new FriendlyGenie();
                System.out.println("Invoked Friendly genie | Number: " + i);
            }


        }
    }


    //@Override
    //public String toString() {
    //    return ":" +  genies[genieNumber];
    //}

}






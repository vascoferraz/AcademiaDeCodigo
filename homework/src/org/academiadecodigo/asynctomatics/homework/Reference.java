package org.academiadecodigo.asynctomatics.homework;

public class Reference {

    public static void main(String[] args) {
        Mutant mutant = new Mutant();

        mutant.name = "Magneto";
        System.out.println("Inside main(): " + mutant.name + " | " + mutant);

        transformIntoWolverine(mutant);
        System.out.println("Inside main(): " + mutant.name + " | " + mutant);
    }

        static void transformIntoWolverine(Mutant wolverine) {
            System.out.println("Inside method() :" + wolverine.name + " | " + wolverine);
            wolverine.name = "Wolverine";
            System.out.println("Inside method() :" + wolverine.name + " | " + wolverine);
        }
    }

    class Mutant {
        String name;
    }
package org.academiadecodigo.asynctomatics.uniqueword;

public class Main {

    public static final String STRING = "teste1 teste2 teste3 teste1 teste2 teste3 teste1 teste2 teste3";

    public static void main(String[] args) {

        UniqueWord wc = new UniqueWord(STRING);

        for (String word : wc) {
            System.out.println(word);
        }

    }
}

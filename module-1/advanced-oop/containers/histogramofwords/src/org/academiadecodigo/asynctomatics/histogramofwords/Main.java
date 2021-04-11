package org.academiadecodigo.asynctomatics.histogramofwords;

public class Main {

    public static final String STRING = "I am so tired so so tired";

    public static void main(String[] args) {

        Vania wordHistogram = new Vania(STRING);

        System.out.println("MAP has " + wordHistogram.size() + " distinct words");

        for (String word : wordHistogram) {
            System.out.println(word + " : " + wordHistogram.get(word));
        }
    }
}

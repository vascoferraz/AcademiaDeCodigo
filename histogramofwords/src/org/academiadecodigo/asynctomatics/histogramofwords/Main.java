package org.academiadecodigo.asynctomatics.histogramofwords;

public class Main {

    public static final String STRING = "test test test test 1 1 1 ";

    public static void main(String[] args) {

        WordHistogramH wordHistogram = new WordHistogramH(STRING);

        System.out.println("MAP has " + wordHistogram.size() + " distinct words");

        for (String word : wordHistogram) {
            System.out.println(word + " : " + wordHistogram.get(word));
        }
    }
}

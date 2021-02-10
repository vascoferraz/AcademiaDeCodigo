package org.academiadecodigo.asynctomatics.histogramofwords;

import java.util.HashMap;
import java.util.Iterator;

public class WordHistogramH extends HashMap<String, Integer> implements Iterable<String> {

    String string;

    public WordHistogramH(String string) {
        this.string = string;
        String[] splitString = string.split(" ");

        for (int i = 0; i < splitString.length; i++) {

            if (!containsKey(splitString[i])) {
                put(splitString[i], 1);
            } else {
                int next = get(splitString[i]);
                put(splitString[i], next + 1);
            }

        }
    }

    @Override
    public Iterator iterator() {
        return keySet().iterator();
    }
}

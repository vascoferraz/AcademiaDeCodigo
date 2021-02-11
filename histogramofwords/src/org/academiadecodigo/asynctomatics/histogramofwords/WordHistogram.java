package org.academiadecodigo.asynctomatics.histogramofwords;

import java.util.HashMap;
import java.util.Iterator;

public class WordHistogram implements Iterable<String>{

    String string;
    HashMap<String, Integer> hashmap = new HashMap<String, Integer>();

    public WordHistogram(String string) {
        this.string = string;
        String[] splitString = string.split(" ");

        for (int i=0 ; i<splitString.length ; i++) {

            if(!hashmap.containsKey(splitString[i])) {
                hashmap.put(splitString[i], 1);
            }

            else {
                int next = hashmap.get(splitString[i]);
                hashmap.put(splitString[i], ++next);
            }
        }
    }


    public int size () {
        return hashmap.size();
    }

    public int get (String string) {
        return hashmap.get(string);
    }

    @Override
    public Iterator iterator() {
        return hashmap.keySet().iterator();
    }
}

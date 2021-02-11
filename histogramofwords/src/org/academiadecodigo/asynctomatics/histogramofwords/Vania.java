package org.academiadecodigo.asynctomatics.histogramofwords;

import java.util.HashMap;
import java.util.Iterator;

public class Vania implements Iterable<String> {


    // fields
    private HashMap<String, Integer> map;
    private int counter;


    // constructor
    public Vania(String str) {

        map = new HashMap<>();
        String[] arrStr = str.split(" ");
        counter=0;

        for (String word : arrStr) {
            counter++;
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                int other = map.get(arrStr[counter-1]);
                map.put(word, ++other);
            }
        }
    }


    public int size() {
        return map.size();
    }

    public Integer get(String str) {
        return map.get(str);
    }

    @Override
    public Iterator<String> iterator() {
        return map.keySet().iterator();
    }
}

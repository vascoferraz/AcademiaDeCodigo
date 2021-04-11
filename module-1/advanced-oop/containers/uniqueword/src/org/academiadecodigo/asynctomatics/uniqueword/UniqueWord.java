package org.academiadecodigo.asynctomatics.uniqueword;

import java.util.HashSet;
import java.util.Iterator;

public class UniqueWord implements Iterable<String> {

    private String string;
    private HashSet<String> hashSet = new HashSet<>();

    public UniqueWord(String string) {
        this.string = string;
        String[] splitString = string.split(" ");

        for (int i=0 ; i<splitString.length ; i++) {

            hashSet.add(splitString[i]);
        }

    }

    @Override
    public Iterator iterator() {
        return hashSet.iterator();
    }
}

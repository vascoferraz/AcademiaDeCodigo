package org.academiadecodigo.asynctomatics.wordreader;

import java.io.*;
import java.util.*;

public class WordReader implements Iterable<String> {

    //ler ficheiro de texto e iterar

    String path;
    String result;

    List<String> myList;

    public WordReader(String path) throws IOException {

        this.path = path;

        FileReader reader = new FileReader(path);
        BufferedReader bReader = new BufferedReader(reader);

        String line = "";
        String result = "";


        while ((line = bReader.readLine()) != null) {
            result += line + "\n";
        }

        bReader.close();
        myList = new ArrayList<String>(Arrays.asList(result.split(" ")));
        System.out.println(myList);
    }


    @Override
    public Iterator iterator() {

        return myList.iterator();
    }
}

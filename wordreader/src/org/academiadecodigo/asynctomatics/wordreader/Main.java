package org.academiadecodigo.asynctomatics.wordreader;

import java.io.IOException;
import java.util.Iterator;

public class Main {

    public static void main(String[] args)  {


        WordReader wordReader = null;
        try {
            wordReader = new WordReader("Files/Test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        Iterator iterator = wordReader.iterator();


        while(iterator.hasNext()) {
            String obj = (String) iterator.next();
            System.out.println(obj);
        }

    }
}

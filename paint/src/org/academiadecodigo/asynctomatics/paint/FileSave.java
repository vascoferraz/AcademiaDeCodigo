package org.academiadecodigo.asynctomatics.paint;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class FileSave {

    private String save;

    public void fileSave(String save) {

        this.save = save;

        try (PrintStream out = new PrintStream(new FileOutputStream("folder/save.txt"))) {
            out.print(save);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}

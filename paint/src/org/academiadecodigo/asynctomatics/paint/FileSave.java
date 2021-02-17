package org.academiadecodigo.asynctomatics.paint;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileSave {

    private String save = "";

    public void fileSave(String save) {

        this.save = save;

        try (PrintStream out = new PrintStream(new FileOutputStream("folder/save.txt"))) {
            out.print(save);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    static String fileLoad(String path, Charset encoding)
            throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }


}

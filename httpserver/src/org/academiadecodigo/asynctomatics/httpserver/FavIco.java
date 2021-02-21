package org.academiadecodigo.asynctomatics.httpserver;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FavIco {

    private PrintWriter out;

    public FavIco(PrintWriter out) throws IOException {

        this.out = out;

        File image = new File("/resources/favicon.ico");
        int imageLen = (int) image.length();


        out.println("HTTP/1.0 200 Document Follows\r\n" +
                "Content-Type: image/ico \r\n" +
                "Content-Length: " + imageLen + "\r\n" +
                "\r\n" + image);
        out.flush();
    }
}
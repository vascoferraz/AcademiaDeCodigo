package org.academiadecodigo.asynctomatics.httpserver;

import java.io.PrintWriter;

public class Home {

    private PrintWriter out;

    public Home(PrintWriter out) {

        this.out = out;

        String messageSen = "<h1>This is the home page</h1>";
        int messageLen = messageSen.getBytes().length;

        out.println("HTTP/1.0 200 Document Follows\r\n" +
                "Content-Type: text/html; charset=UTF-8\r\n" +
                "Content-Length: " + messageLen + "\r\n" +
                "\r\n" + messageSen);
        out.flush();
    }
}

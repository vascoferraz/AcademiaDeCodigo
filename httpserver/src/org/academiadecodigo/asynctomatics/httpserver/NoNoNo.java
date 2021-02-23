package org.academiadecodigo.asynctomatics.httpserver;

import java.io.*;
import java.net.Socket;

public class NoNoNo {

    private PrintWriter out;

    public NoNoNo(PrintWriter out) {

        this.out = out;

        String messageSen = "<h1>No no no</h1>";
        int messageLen = messageSen.getBytes().length;

        out.println("HTTP/1.0 400 Not Found\r\n" +
                "Content-Type: text/html; charset=UTF-8\r\n" +
                "Content-Length: " + messageLen + "\r\n" +
                "\r\n" + messageSen);

        out.flush();
        out.close();
    }
}

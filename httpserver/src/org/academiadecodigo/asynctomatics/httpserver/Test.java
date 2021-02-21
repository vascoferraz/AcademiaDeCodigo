package org.academiadecodigo.asynctomatics.httpserver;

import java.io.PrintWriter;

public class Test {

    private PrintWriter out;

    public Test(PrintWriter out) {

        this.out = out;

        String messageSen = "<img src=\"img src=\"resources/rurounikenshin.png\" alt=\"Rurouni Kenshin\" width=\"460\" height=\"345\">";
        int messageLen = messageSen.getBytes().length;

        out.println("HTTP/1.0 200 Document Follows\r\n" +
                "Content-Type: image/png \r\n" +
                "Content-Length: " + messageLen + "\r\n" +
                "\r\n" + messageSen);

        out.flush();
        out.close();
    }
}

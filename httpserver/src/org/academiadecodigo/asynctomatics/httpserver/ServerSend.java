package org.academiadecodigo.asynctomatics.httpserver;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerSend {

    private Socket socket;


    public void serverSendPacket(Socket socket) throws IOException {

        this.socket = socket;
        String messageSen = "<h1>Nice :)</h1>";
        int messageLen = messageSen.length();

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        out.println("HTTP/1.0 200 Document Follows\r\n" +
                "Content-Type: text/html; charset=UTF-8\r\n" +
                "Content-Length: " + messageLen + "\r\n" +
                "\r\n" + messageSen);
    }
}

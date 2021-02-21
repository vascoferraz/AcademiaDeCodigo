package org.academiadecodigo.asynctomatics.httpserver;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerSend {

    private Socket socket;
    private String resource;

    public void serverSendPacket(Socket socket, String resource) throws IOException {

        this.socket = socket;
        this.resource = resource;

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        System.out.println(resource);
        
        switch (resource) {
            case "/":
                new Home(out);
                break;

            case "/favicon.ico":
                new FavIco(out);
                break;

            default:
                new NoNoNo(out);
                break;

        }
    }
}

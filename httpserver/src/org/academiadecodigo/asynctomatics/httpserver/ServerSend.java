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

        if (resource.equals("/")) {
           new Home(out);
        }

       if (resource.equals("/image")) {
            new FavIco(out);
        }

        else {
            new NoNoNo(out);
        }

    }
}






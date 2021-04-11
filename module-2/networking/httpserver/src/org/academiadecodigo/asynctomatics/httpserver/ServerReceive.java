package org.academiadecodigo.asynctomatics.httpserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReceive {

    private Socket socket;

    private String verb;
    private String resource;
    private String protocol;

    public void serverReceivePacket(Socket socket) throws IOException {
        this.socket = socket;

        BufferedReader in;
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String line;
        StringBuilder request = new StringBuilder();
        while ((line = in.readLine()) != null ) {
            request.append(line).append("\r\n");
            if (line.isEmpty()) {
                System.out.println(request);
                break;
            }
        }

        String requestString = request.toString().split("\n")[0];
        System.out.println(requestString);
        verb = requestString.split(" ")[0];
        resource = requestString.split( " " )[1];
        protocol = requestString.split(" ")[2];

        System.out.println(verb);
        System.out.println(resource);
        System.out.println(protocol);
    }

    public String verb() {
        return verb;
    }

    public String resource() {
        return resource;
    }



}

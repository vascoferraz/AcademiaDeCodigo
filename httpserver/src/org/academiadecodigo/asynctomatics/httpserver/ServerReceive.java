package org.academiadecodigo.asynctomatics.httpserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReceive {

    private Socket socket;


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

    }


}

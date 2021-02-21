package org.academiadecodigo.asynctomatics.httpserver;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private int port;
    private Socket socket;

    public Server(int port) throws IOException {

        this.port = 10201;

        ServerSocket listener = new ServerSocket(port);
        ServerReceive serverReceive = new ServerReceive();
        ServerSend serverSend = new ServerSend();

        while (true) {

            socket = listener.accept();
            serverReceive.serverReceivePacket(socket);
            serverSend.serverSendPacket(socket, serverReceive.resource());

        }
    }
}


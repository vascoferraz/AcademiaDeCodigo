package org.academiadecodigo.asynctomatics.chatwiththreadsv2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class Server {

    public static void main(String[] args) throws IOException, InterruptedException {

        int port = 10201;
        ServerSocket serverSocket = new ServerSocket(port);

        LinkedList myList = new LinkedList();

        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Accepted connection from " + clientSocket);
            myList.add(new ClientHandler(clientSocket));
            ClientHandler clientHandler = (ClientHandler) (myList.getLast());
            clientHandler.start();
            System.out.println(myList.size());
            clientHandler.handleClientSocket();

        }
    }
}







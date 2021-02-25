package org.academiadecodigo.asynctomatics.chatwiththreadsv2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {

    public static void main(String[] args) throws IOException {

        int port = 10201;
        int numberOfThreads = 10;
        ServerSocket serverSocket = new ServerSocket(port);

        LinkedList<Socket> myList = new LinkedList();

        ExecutorService fixedPool = Executors.newFixedThreadPool(numberOfThreads);


        while (true) {
            Socket clientSocket = serverSocket.accept();
            System.out.println("Accepted connection from " + clientSocket);
            myList.add(clientSocket);
            fixedPool.submit((new ClientHandler(clientSocket, myList)));
        }
    }

}











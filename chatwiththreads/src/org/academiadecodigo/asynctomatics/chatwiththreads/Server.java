package org.academiadecodigo.asynctomatics.chatwiththreads;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {


    public static void main(String[] args) throws IOException {

        int portNumber = 10201;

        ServerSocket serverSocket = new ServerSocket(portNumber);
        //ClientHandler clientHandler = new ClientHandler(serverSocket);

        ExecutorService fixedPool = Executors.newFixedThreadPool(10);
        // submit 10 tasks to be executed
        for (int i = 0; i < 2; i++) {
            fixedPool.submit(new ClientHandler(serverSocket));
        }

    }

}

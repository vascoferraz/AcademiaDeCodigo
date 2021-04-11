package org.academiadecodigo.asynctomatics.chatwiththreads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.LinkedList;

public class ClientHandler implements Runnable {

    private String message;
    private BufferedReader in;
    private PrintWriter out;
    private Socket clientSocket;

    public ClientHandler(ServerSocket serverSocket) throws IOException {

        clientSocket = serverSocket.accept();
        message = "";
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        out = new PrintWriter(clientSocket.getOutputStream(), true);
    }


    @Override
    public void run() {

        System.out.println("HERE");

        while (true) {

            try {
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                message = in.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Client sends: " + message);

            if (message.contains("/quit")) {
                System.out.println("Client has left the chat");
                try {
                    clientSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return;
            }

            message = ("Server sends: " + message);
            out.println(message);

        }
    }

}

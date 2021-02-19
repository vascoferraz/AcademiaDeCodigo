package org.academiadecodigo.asynctomatics.tcpserverclient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException {

        // STEP1: Get parameters from command line arguments
        int portNumber = 10201;
        String message = "";

        // STEP2: Bind to local port and block while waiting for client connections
        ServerSocket serverSocket = new ServerSocket(portNumber);
        Socket clientSocket = serverSocket.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        while (!message.equals("/quit")) {
            // STEP3: Setup input and output streams

            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            // STEP4: Read from/write to the stream
            message = in.readLine();
            System.out.println(message);

        }

        // STEP5: Close the stream
        in.close();

        // STEP6: Close the sockets
        clientSocket.close();
    }


}
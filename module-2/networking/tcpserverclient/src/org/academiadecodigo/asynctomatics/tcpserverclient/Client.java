package org.academiadecodigo.asynctomatics.tcpserverclient;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {


        // STEP1: Get the host and the port from the command-line
        String hostName = "localhost";
        int portNumber = 10201;
        Scanner scan = new Scanner(System.in);

        // STEP2: Open a client socket, blocking while connecting to the server
        Socket clientSocket = new Socket(hostName, portNumber);
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

        // STEP3: Setup input and output streams
        out = new PrintWriter(clientSocket.getOutputStream(), true);

        while (true) {

            out.println(scan.nextLine());
        }

        // STEP4: Read from/write to the stream
        // STEP5: Close the streams
        // STEP6: Close the sockets

    }
}

package org.academiadecodigo.asynctomatics.chatwiththreads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {

        String hostName = "localhost";
        int portNumber = 10201;
        String message = "";
        Scanner scan = new Scanner(System.in);

        Socket clientSocket = new Socket(hostName, portNumber);
        PrintWriter out;
        BufferedReader in;

        out = new PrintWriter(clientSocket.getOutputStream(), true);

        while (true) {

            out.println(scan.nextLine());

            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            message = in.readLine();
            System.out.println(message);
        }

    }
}
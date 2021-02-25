package org.academiadecodigo.asynctomatics.chatwiththreadsv2;

import java.io.*;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Scanner;

public class ClientHandler implements Runnable {

    private Socket clientSocket;
    private LinkedList<Socket> myList;
    private InputStream inputStream;
    private OutputStream outputStream;

    private String message = "";
    private String userName;

    public ClientHandler(Socket clientSocket, LinkedList myList) {
        this.clientSocket = clientSocket;
        this.myList = myList;
    }

    @Override
    public void run() {
        try {
            handleClientSocket();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void handleClientSocket() throws IOException, InterruptedException {

        inputStream = clientSocket.getInputStream();
        outputStream = clientSocket.getOutputStream();

        setUserName();


        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ((line = reader.readLine()) != null) {
            if ("quit".equalsIgnoreCase(line)) {
                break;
            }

            String message = userName + ": " + line + "\n";

            for (int i = 0; i < myList.size(); i++) {

                if (myList.get(i) == this.clientSocket) {
                    continue;
                }
                myList.get(i).getOutputStream().write(message.getBytes());
                outputStream.flush();
            }
        }


        clientSocket.close();
    }

    private void setUserName() throws IOException {

        outputStream.write("Your name is: ".getBytes());
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        userName = reader.readLine();

        outputStream.write(("Welcome: " + userName + "\n").getBytes());
        outputStream.flush();
    }
}


package org.academiadecodigo.asynctomatics.chatwiththreadsv2;

import java.io.*;
import java.net.Socket;

public class ClientHandler extends Thread{

    private final Socket clientSocket;
    private InputStream inputStream;
    private OutputStream outputStream;
    private String message = "";

    public ClientHandler(Socket clientSocket) throws IOException {

        this.clientSocket = clientSocket;
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

        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while ( (line = reader.readLine()) != null) {
            if ("quit".equalsIgnoreCase(line)) {
                break;
            }

            String message = "You typed: " + line + "\n";
            outputStream.write(message.getBytes());
        }

        clientSocket.close();
    }

    public void sendMessage() throws IOException {
        outputStream.write(message.getBytes());
    }

}

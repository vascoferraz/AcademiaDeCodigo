package org.academiadecodigo.asynctomatics.simplewebserverthreads;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Single-threaded simple web server implementation
 */
public class WebServer {

    private static final Logger logger = Logger.getLogger(WebServer.class.getName());

    public static final String DOCUMENT_ROOT = "www/";
    public static final int DEFAULT_PORT = 8888;

    private ServerSocket bindSocket = null;

    public static void main(String[] args) {

        try {

            int port = args.length > 0 ? Integer.parseInt(args[0]) : DEFAULT_PORT;

            WebServer webServer = new WebServer();
            webServer.listen(port);

        } catch (NumberFormatException e) {

            System.err.println("Usage: WebServer [PORT]");
            System.exit(1);

        }
    }

    private void listen(int port) {

        try {

            bindSocket = new ServerSocket(port);
            logger.log(Level.INFO, "server bind to " + getAddress(bindSocket));

            dispatch(bindSocket);

        } catch (IOException e) {

            logger.log(Level.SEVERE, "could not bind to port " + port);
            logger.log(Level.SEVERE, e.getMessage());
            System.exit(1);
        }
    }

    private void dispatch(ServerSocket bindSocket) {

        while (true) {
            try {
                ClientHandler clientHandler = new ClientHandler(bindSocket.accept());
                new java.lang.Thread(clientHandler).start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String getAddress(ServerSocket socket) {

        if (socket == null) {
            return null;
        }

        return socket.getInetAddress().getHostAddress() + ":" + socket.getLocalPort();
    }

    private String getAddress(Socket socket) {
        return socket.getInetAddress().getHostAddress() + ":" + socket.getLocalPort();
    }

}

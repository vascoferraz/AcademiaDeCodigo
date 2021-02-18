package org.academiadecodigo.asynctomatics.udpserverclient;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;

public class Server {

    public static void main(String[] args) throws IOException {

        byte[] recvBuffer = new byte[1024];

        DatagramSocket socket = new DatagramSocket(10201);

        DatagramPacket receivePacket = new DatagramPacket(recvBuffer, recvBuffer.length);
        socket.receive(receivePacket);

        String message = new String(recvBuffer, StandardCharsets.UTF_8);
        System.out.println("Server: " + message);


        message = message.toUpperCase();


        byte[] messageBytes = message.getBytes();
        InetAddress host = InetAddress.getByName("localhost");

        DatagramPacket request = new DatagramPacket(messageBytes, messageBytes.length, host, 30007);
        socket.send(request);
        socket.close();

    }
}



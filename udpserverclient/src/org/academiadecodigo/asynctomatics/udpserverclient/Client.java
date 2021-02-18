package org.academiadecodigo.asynctomatics.udpserverclient;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class Client {

    public static void main(String[] args) throws IOException {

        DatagramSocket socket = new DatagramSocket(30007);
        String message = "Hello from client";

        byte[] messageBytes = message.getBytes();
        InetAddress host = InetAddress.getByName("localhost");

        DatagramPacket request = new DatagramPacket(messageBytes, messageBytes.length, host, 10201);
        socket.send(request);

        byte[] recvBuffer = new byte[1024];
        DatagramPacket receivePacket = new DatagramPacket(recvBuffer, recvBuffer.length);
        socket.receive(receivePacket);
        message = new String(recvBuffer, StandardCharsets.UTF_8);
        System.out.println(message);

    }
}













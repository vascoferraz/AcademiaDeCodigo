package org.academiadecodigo.asynctomatics.httpserver;

import java.io.*;
import java.net.Socket;

public class FavIco {

    private Socket socket;

    public FavIco(Socket socket) throws IOException {

        this.socket = socket;

        DataOutputStream favicon = new DataOutputStream(socket.getOutputStream());

        File inputFile = new File("resources/favicon.ico");
        FileInputStream infile = new FileInputStream(inputFile);

        favicon.write(("HTTP/1.0 200 Document Follows\r\n").getBytes() );
        favicon.write(("Content-Type: image/ico\r\n").getBytes() );
        favicon.write(("Content-Length:").getBytes() );
        favicon.write((infile.toString().getBytes()));
        favicon.write(("\r\n\r\n").getBytes() );

        int c;
        while ((c = infile.read()) != -1) {
            favicon.write(c);
        }

        infile.close();
        favicon.flush();
        favicon.close();
    }
}

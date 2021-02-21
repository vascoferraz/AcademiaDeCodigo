package org.academiadecodigo.asynctomatics.httpserver;

import java.io.*;
import java.net.Socket;

public class FavIco {

    private PrintWriter out;
    private Socket socket;

    public FavIco(PrintWriter out, Socket socket) throws IOException {

        this.out = out;
        this.socket = socket;

        BufferedOutputStream favicon = new BufferedOutputStream(socket.getOutputStream());

        File inputFile = new File("resources/favicon.ico");
        FileInputStream infile = new FileInputStream(inputFile);

        int c;
        while ((c = infile.read()) != -1) {
            favicon.write(c);
        }

        infile.close();
        favicon.flush();
        favicon.close();
        out.flush();
    }
}

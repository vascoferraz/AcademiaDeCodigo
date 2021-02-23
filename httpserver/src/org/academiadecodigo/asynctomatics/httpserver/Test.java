package org.academiadecodigo.asynctomatics.httpserver;

import java.io.*;
import java.net.Socket;

public class Test {

    private Socket socket;

    public Test (Socket socket) throws IOException {

        this.socket = socket;

        DataOutputStream test = new DataOutputStream(socket.getOutputStream());

        File inputFile = new File("resources/index.html");
        FileInputStream infile = new FileInputStream(inputFile);

        test.write(("HTTP/1.0 200 Document Follows\r\n").getBytes() );
        test.write(("Content-Type: text/html; charset=UTF-8\r\n").getBytes() );
        test.write(("Content-Length:").getBytes() );
        test.write((infile.toString().getBytes()));
        test.write(("\r\n\r\n").getBytes() );

        int c;
        while ((c = infile.read()) != -1) {
            test.write(c);
        }

        infile.close();
        test.flush();
        test.close();
    }
}

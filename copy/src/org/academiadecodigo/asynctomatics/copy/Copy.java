package org.academiadecodigo.asynctomatics.copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {

    String input;
    String output;

    public Copy(String input, String output) throws IOException {

        this.input = input;
        this.output = output;

        FileInputStream inputStream = new FileInputStream(input);
        FileOutputStream outputStream = new FileOutputStream(output);

        byte[] buffer = new byte[1];

        while (inputStream.read(buffer) != -1) {

            outputStream.write(buffer);
            outputStream.flush();

            for (int i=0 ; i<buffer.length ; i++) {
                System.out.println(buffer[i]);
            }
        }
        inputStream.close();
        outputStream.close();

    }

}

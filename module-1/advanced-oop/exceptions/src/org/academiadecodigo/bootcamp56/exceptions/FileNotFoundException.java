package org.academiadecodigo.bootcamp56.exceptions;

public class FileNotFoundException extends FileException {

    public FileNotFoundException() {
        super();
    }

    public void fileNotFound() {
        System.out.println("File not found");
    }

}

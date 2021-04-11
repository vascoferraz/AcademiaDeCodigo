package org.academiadecodigo.bootcamp56.exceptions;

public class NotEnoughSpaceException extends FileException {

    public NotEnoughSpaceException() {
        super();
    }

    public void spaceException() {
        System.out.println("Not enough space");
    }

}

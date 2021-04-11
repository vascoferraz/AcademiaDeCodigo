package org.academiadecodigo.bootcamp56.exceptions;

public class NotEnoughPermissionException extends FileException {

    public NotEnoughPermissionException() {
        super();
    }

    public void permissionDenied() {
        System.out.println("Permission Denied");
    }

}

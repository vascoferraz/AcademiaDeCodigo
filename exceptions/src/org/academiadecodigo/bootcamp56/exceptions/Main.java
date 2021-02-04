package org.academiadecodigo.bootcamp56.exceptions;

public class Main {

    public static void main(String[] args) {

        FileManager fileManager = new FileManager(3);

        fileManager.logout();

        if (fileManager.isLogged() == false) {

            try {
                fileManager.createFile("myFile1");
            } catch (NotEnoughPermissionException exception) {
                exception.permissionDenied();
            } catch (NotEnoughSpaceException exception) {
                exception.spaceException();
            }

            try {
                fileManager.createFile("myFile2");
            } catch (NotEnoughPermissionException exception) {
                exception.permissionDenied();
            } catch (NotEnoughSpaceException exception) {
                exception.spaceException();
            }

            try {
                fileManager.createFile("myFile3");
            } catch (NotEnoughPermissionException exception) {
                exception.permissionDenied();
            } catch (NotEnoughSpaceException exception) {
                exception.spaceException();
            }

            try {
                fileManager.createFile("myFile4");
            } catch (NotEnoughPermissionException exception) {
                exception.permissionDenied();
            } catch (NotEnoughSpaceException exception) {
                exception.spaceException();
            }

        }


        fileManager.login();

        if (fileManager.isLogged() == true) {

            try {
                fileManager.createFile("myFile1");
            } catch (NotEnoughPermissionException exception) {
                exception.permissionDenied();
            } catch (NotEnoughSpaceException exception) {
                exception.spaceException();
            }

            try {
                fileManager.createFile("myFile2");
            } catch (NotEnoughPermissionException exception) {
                exception.permissionDenied();
            } catch (NotEnoughSpaceException exception) {
                exception.spaceException();
            }

            try {
                fileManager.createFile("myFile3");
            } catch (NotEnoughPermissionException exception) {
                exception.permissionDenied();
            } catch (NotEnoughSpaceException exception) {
                exception.spaceException();
            }

            try {
                fileManager.createFile("myFile4");
            } catch (NotEnoughPermissionException exception) {
                exception.permissionDenied();
            } catch (NotEnoughSpaceException exception) {
                exception.spaceException();
            }

        }

        //fileManager.logout();
        fileManager.login();

        try {
            fileManager.getFile("myFile8");
        } catch (NotEnoughPermissionException exception) {
            exception.permissionDenied();
        } catch (FileNotFoundException exception) {
            exception.fileNotFound();
        }






    }
}



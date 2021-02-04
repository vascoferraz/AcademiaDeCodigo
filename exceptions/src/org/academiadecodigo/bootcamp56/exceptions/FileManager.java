package org.academiadecodigo.bootcamp56.exceptions;

public class FileManager {

    private int numberOfFiles;
    private File[] file;
    private int filePosition;

    private boolean logged = false;

    public FileManager (int numberOfFiles) {
        this.numberOfFiles = numberOfFiles;
        file = new File[numberOfFiles];
        filePosition = 0;
    }


    public void login() {
        System.out.println("You logged in");
        logged = true;
    }


    public void logout() {
        System.out.println("You logged out");
        logged = false;
    }


    public boolean isLogged() {
        return logged;
    }



    public File getFile(String fileName) throws FileNotFoundException, NotEnoughPermissionException{

        File returnFile = null;

        if (logged == false) {
            throw new NotEnoughPermissionException();
        }

        for (int i = 0 ; i < file.length ; i++) {

            if (file[i].getName().equals(fileName)) {
                System.out.println(file[i].getName());
                returnFile = file[i];
                return returnFile;
            }

            if (i == file.length-1 && !file[i].getName().equals(fileName) ) {throw new FileNotFoundException();}
        }
        return returnFile;
    }


    public void createFile(String fileName) throws NotEnoughSpaceException, NotEnoughPermissionException {

        if (logged == false) {
            throw new NotEnoughPermissionException();
        }

        if (filePosition >= numberOfFiles) {
            throw new NotEnoughSpaceException();
        }

        file[filePosition] = new File(fileName);
        System.out.println("File " + fileName + " created");
        filePosition++;



    }



}

package org.academiadecodigo.bootcamp56.hotel;

public class Room {

    private boolean[] roomAvailable = {true, true};


    public int checkIn(String name, int i) {

        if (roomAvailable[i] == false) {
            System.out.println(name + ", room number " + i + " not available. Please choose another room");
            return -1;
        }
        else {
            roomAvailable[i] = false;
            System.out.println(name + ", room number " + i + " was checked. Enjoy your stay.");
            return i;
        }
    }

    public int checkOut(int i) {
        roomAvailable[i] = true;
        return i;
    }

    public boolean Available(int i) {
        return roomAvailable[i];
    }

}


package org.academiadecodigo.bootcamp56.hotel;

public class Hotel {

    private static Room room = new Room();


    public int checkIn(String name, int i) {
        room.checkIn(name, i);
        return i;
    }

    public int checkOut(int i) {
        room.checkOut(i);
        return i;
    }

    public boolean Available(int i) {
        return room.Available(i);
    }




}
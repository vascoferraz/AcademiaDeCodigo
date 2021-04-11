package org.academiadecodigo.bootcamp56.hotel;

public class Client {

    private String name;

    public Client (String name) {
        this.name = name;
    }

    private Hotel hotel = new Hotel();

    public int checkIn(String name, int i) {
        hotel.checkIn(name, i);
        return i;
    }

    public int checkOut(int i) {
        hotel.checkOut(i);
        return i;
    }

    public boolean Available(int i) {
        return hotel.Available(i);
    }

    public String getName() {
        return name;
    }





}


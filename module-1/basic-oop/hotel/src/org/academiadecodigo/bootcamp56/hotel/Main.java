package org.academiadecodigo.bootcamp56.hotel;

public class Main {

    public static void main(String[] args) {

        Client vasco = new Client("Vasco");
        Client marlene = new Client("Marlene");

        int roomNumber = 1;

        vasco.checkIn(vasco.getName(), 1);
        //vasco.checkOut(roomNumber);

        marlene.checkIn(marlene.getName(), 0);

        vasco.checkOut( 0);
        vasco.checkIn(vasco.getName(), 0);








    }

}

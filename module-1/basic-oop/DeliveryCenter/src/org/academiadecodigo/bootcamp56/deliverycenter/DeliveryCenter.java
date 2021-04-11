package org.academiadecodigo.bootcamp56.deliverycenter;

public class DeliveryCenter {

    public static void main(String[] args) {
	// write your code here

        Order pantufas = new Order("Hipercentro, fracção N", "Kidzania");

        Order RPi = new Order("Hipercentro, fracção N", "PCDiga");

        pantufas.printDestiny();
        System.out.println(pantufas.getId());
        System.out.println(RPi.getId());

        System.out.println(Order.currentOrderId);
    }
}

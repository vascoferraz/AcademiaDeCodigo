package org.academiadecodigo.bootcamp56.deliverycenter;

public class Order {

    private String destiny;
    private String origin;
    private int id;
    public static int currentOrderId = 0;

    public Order (String destiny, String origin) {
        this.destiny = destiny;
        this.origin = origin;
        id = ++currentOrderId;
    }


    public void printDestiny() {
        System.out.println(this.destiny);
    }

    public int getId(){
        return this.id;
    }

}




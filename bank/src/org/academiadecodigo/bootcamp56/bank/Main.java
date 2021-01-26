package org.academiadecodigo.bootcamp56.bank;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Client vasco = new Client("Vasco");
        Client marlene = new Client("Marlene");

        double money;

        System.out.println("Welcome " + vasco.clientName());

        System.out.println(vasco.clientName() + ", your balance is " + vasco.consultMoney() + "€");

        money = 100.00;
        if (vasco.consultMoney() < money) {
            System.out.println(vasco.clientName() + ", you can't withdraw " + money + "€" + " because your balance is " + vasco.consultMoney() + "€");
        }
        else {
            vasco.clientWithdraw(money);
            System.out.println(vasco.clientName() + ", you withdrew " + money + "€" + " and your balance is " + vasco.consultMoney() + "€");
        }

        money = 20.00;
        vasco.clientDeposit(money);
        System.out.println(vasco.clientName() + ", you deposited " + money + "€" + " and your balance is " + vasco.consultMoney() + "€");

        System.out.println();
        System.out.println("----------------------------------------------");
        System.out.println();


        // ** Bank transfer between clients ** //
        double bankTransferAmount = 1.00;

        if (bankTransferAmount <= 0) {
            System.out.println(marlene.clientName() + ", please use a positive number" );
        }

        else {
            if (bankTransferAmount <= marlene.consultMoney()) {
                marlene.clientTransfer(bankTransferAmount, marlene, vasco);
                System.out.println(marlene.clientName() + " transferred " + bankTransferAmount + "€" + " into " + vasco.clientName() + "'s account" );
                System.out.println(marlene.clientName() + ", your balance is: " + marlene.consultMoney() + "€");
                System.out.println(vasco.clientName() + ", your balance: is: " + vasco.consultMoney() + "€");
            }
            else {
                System.out.println(marlene.clientName() + ", your current balance (" + marlene.consultMoney() + "€) won't permit you to perform this operation" );
            }
        }

    }

}

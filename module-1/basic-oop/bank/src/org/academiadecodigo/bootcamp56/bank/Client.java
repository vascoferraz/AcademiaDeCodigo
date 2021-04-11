package org.academiadecodigo.bootcamp56.bank;

public class Client {

    private String clientName;

    private Bank cgd = new Bank(100);

    public Client (String clientName) {
        this.clientName = clientName;
    }

    public String clientName() {
        return clientName;
    }


    public double consultMoney () {
        return cgd.consultMoney();
    }

    public void clientWithdraw (double money) {
        cgd.bankWithdraw(money);
    }

    public void clientDeposit (double money) {
        cgd.bankDeposit(money);
    }

    public void clientTransfer(double money, Client origin, Client destination) {
        cgd.bankTransfer(money, origin, destination);
    }


}


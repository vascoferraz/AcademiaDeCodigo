package org.academiadecodigo.bootcamp56.bank;

public class Bank {

    private double totalMoney;

    public Bank (int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public double consultMoney() {
        return totalMoney;
    }

    public void bankWithdraw (double money) {
        if (totalMoney - money < 0) {
            totalMoney = totalMoney;
        }
        else {
            totalMoney = totalMoney - money;
        }
    }

    public void bankDeposit (double money) {
        totalMoney = totalMoney + money;
    }

    public void bankTransfer(double money, Client origin, Client destination) {
        origin.clientWithdraw(money);
        destination.clientDeposit(money);
    }

}
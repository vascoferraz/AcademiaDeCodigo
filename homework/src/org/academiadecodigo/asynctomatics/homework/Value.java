package org.academiadecodigo.asynctomatics.homework;

public class Value {

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Inside main(): " + num);
        change(num);
        System.out.println("Inside main(): " + num);
    }

    public static void change (int num) {
        System.out.println("Inside change() :" + num);
        num = 20;
        System.out.println("Inside change() :" + num);
    }
}

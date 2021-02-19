package org.academiadecodigo.asynctomatics.homework;

public class IntTest {

    public static void main(String[] args) {
        MyInt myNumber = new MyInt();

        myNumber.number = 10;
        System.out.println("Inside main(): " + myNumber.number + " | " + myNumber);

        change(myNumber);
        System.out.println("Inside main(): " + myNumber.number + " | " + myNumber);
    }

    static void change(MyInt otherNumber) {
        System.out.println("Inside method() :" + otherNumber.number + " | " + otherNumber);
        otherNumber.number = 20;
        System.out.println("Inside method() :" + otherNumber.number + " | " + otherNumber);
    }
}

class MyInt {
    int number;
}

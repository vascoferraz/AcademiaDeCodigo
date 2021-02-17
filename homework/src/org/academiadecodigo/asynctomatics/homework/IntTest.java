package org.academiadecodigo.asynctomatics.homework;

public class IntegerTest2 {

    public static void main(String[] args) {
        MyInt myNumber = new MyInt();

        myNumber.number = 10;
        System.out.println("Inside main(): " + myNumber.number + " | " + myNumber);

        transformIntoWolverine(myNumber);
        System.out.println("Inside main(): " + myNumber.number + " | " + myNumber);
    }

    static void transformIntoWolverine(MyInt otherNumber) {
        System.out.println("Inside method() :" + otherNumber.number + " | " + otherNumber);
        otherNumber.number = 20;
        System.out.println("Inside method() :" + otherNumber.number + " | " + otherNumber);
    }
}

class MyInt {
    int number;
}
package org.academiadecodigo.bootcamp56.closestneighbours;

public class ClosestNeighbours {

    public static void main(String[] args) {

        int[] myArray = {0, 5, 1209, 6, 2, 111, 112, 33};
        int[] result = findClosest(myArray);
        // print the elements of the resulting array
        System.out.println("Left: " + result[0] + " | " + "Right: " + result[1]);

    }

    private static int[] findClosest(int[] numbers) {
        // hint: remember Math.abs();

        int min = Math.abs(numbers[0] - numbers[1]);
        int delta = 0;
        int n1 = 0;
        int n2 = 0;
        int n1n2[] = {0,0};
        int index1 = 0;
        int index2 = 0;

        for (int i=1 ; i<numbers.length-1 ; i++) {

            delta = Math.abs(numbers[i] - numbers[i+1]);

            if (delta < min) {
                min=delta;
                index1 = i;
                index2 = i+1;
            }

        }

        System.out.println("");
        System.out.println("Just for debugging purposes: " + "Minimum: " + min);
        System.out.println("Just for debugging purposes: " + index1 + ": " + numbers[index1] + " | " + index2 + ": " + numbers[index2]);
        System.out.println("");

        n1 = numbers[index1];
        n2 = numbers[index2];

        n1n2[0] = n1;
        n1n2[1] = n2;

        return n1n2;

    }
    
}

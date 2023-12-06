package WEEK10;

import java.util.Arrays;

public class Number01 {
    public static void main(String[] args) {

        int maxRowLength = 5; // Set the maximum row length

        int[][] myNumber = new int[3][maxRowLength];
        
        // Rest of your code remains unchanged
        for (int i = 0; i < myNumber.length; i++) {
            System.out.println(Arrays.toString(myNumber[i]));
        }

        for (int i = 0; i < myNumber.length; i++) {
            System.out.println("Length of row " + (i + 1) + ": " + myNumber[i].length);
        }
    }
}


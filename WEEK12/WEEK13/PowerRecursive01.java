package WEEK13;

import java.util.Scanner;

public class PowerRecursive01 {
    static int calculatePower(int base, int pow) {
        if (pow==0) 
            return 1;
        else 
            System.out.print(base + "x");
            return base*calculatePower(base, pow-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Base Number: ");
        int base = input.nextInt();
        System.out.print("Input Power Number: ");
        int power = input.nextInt();

        System.out.print("Result of " + base + " power " + power + " = ");
        int result = calculatePower(base, power);
        System.out.println(" = " + result);


    }
}

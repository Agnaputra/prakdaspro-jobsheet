package WEEK13;

import java.util.Scanner;

public class Assingment2week13 {
     static int summationRecursive(int n) {
        if(n==0)
            return 0;
        else{
            System.out.print(n + "+");
            return n+(summationRecursive(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input N : ");
        int n = input.nextInt();
     
        System.out.print(" = ");
        int result = summationRecursive(n);
        System.out.println(" = "+ result );
    } 
       /*  static int sum(int n) {
            // Base case
            if (n == 1) {
                return 1;
            } else {
                // Recursive case: sum the current number and call the function with n-1
                return n + sum(n - 1);
            }
        }
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
    
            System.out.print("Enter a number to calculate the sum: ");
            int number = input.nextInt();
    
            int result = sum(number);
    
            System.out.println("Sum of numbers from 1 to " + number + " is: " + result);
        }*/
    }
    


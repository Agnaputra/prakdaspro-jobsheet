package WEEK13;
import java.util.Scanner;
public class Assingment3week13 {
    static boolean isPrime(int n, int divisor) {
        // Base cases
        if (n <= 1) {
            return false;  
        }
        if (divisor == 1) {
            return true;   
        }

        
        if (n % divisor == 0) {
            return false;  
        } else {
           
            return isPrime(n, divisor - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check for primality: ");
        int number = input.nextInt();

        if (isPrime(number, number - 1)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

    


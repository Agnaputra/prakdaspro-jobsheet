package WEEK12;

import java.util.Scanner;

public class ExpressingGratitude_01 {
    private static Scanner input = new Scanner(System.in);

    public static String getGreetingRecipient() {
        System.out.print("Input the name of people you want to greet: ");
        String recipientName = input.nextLine();
        return recipientName;
    }

    public static void sayThankYou() {
        String name = getGreetingRecipient();
        System.out.println("Thank you " + name + " for being the best teacher in the world");
        System.out.println("You inspired in me a love for learning and made me feel like I could ask you anything.");
    }

    public static void sayAdditionalGreetings(String greeting) {
        System.out.println(greeting);
    
        input.close();
    }    
    public static void main(String[] args) {
       // String name = getGreetingRecipient();
        sayThankYou();

        String addGreeting = "Wish you all the best for your future!";
        sayAdditionalGreetings(addGreeting);

        // Close the Scanner when you're done using it
       input.close();
    }
}

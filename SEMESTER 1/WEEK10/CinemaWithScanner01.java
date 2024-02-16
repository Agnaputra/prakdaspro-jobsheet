package WEEK10;
import java.util.Scanner;

public class CinemaWithScanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row, column;
        String name;
        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Input audience data
                    System.out.print("Enter a name: ");
                    name = sc.nextLine();
                    System.out.print("Enter row number: ");
                    row = sc.nextInt();
                    System.out.print("Enter column number: ");
                    column = sc.nextInt();
                    sc.nextLine(); // Consume the newline character

                    // Check if the seat row/column number is within the valid range
                    if (!isValidSeat(row, column, audience)) {
                        System.out.println("Invalid seat. Please choose a valid row and column.");
                        continue; // Restart the loop
                    }

                   // Check if the seat is already occupied
                    if (audience[row - 1][column - 1] != null) {
                    System.out.println("Warning: The seat is already occupied. Please choose another seat.");
                     continue; // Restart the loop
                    }
                    audience[row - 1][column - 1] = name;
                    break;

                case 2:
                    // Show audience list
                    for (String[] rowAudience : audience) {
                        for (String audienceName : rowAudience) {
                             if (audienceName == null) {
                                System.out.print("*** ");
                            } else {
                                System.out.print(audienceName + " ");
                            }
                    }
                    System.out.println();
                }
                    break;

                case 3:
                    // Exit
                    System.out.println("Exiting the program.");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid menu option.");
            }
        }
    }

    // Function to check if the seat is within the valid range
    private static boolean isValidSeat(int row, int column, String[][] audience) {
        return row >= 1 && row <= audience.length && column >= 1 && column <= audience[0].length;


    }
}

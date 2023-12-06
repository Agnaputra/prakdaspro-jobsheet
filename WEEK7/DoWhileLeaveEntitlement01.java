package WEEK7;

import java.util.Scanner;

public class DoWhileLeaveEntitlement01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int leaveEntitlement, numLeave;
        String confirmation;

        System.out.println("Jatah cuti:");
        leaveEntitlement = sc.nextInt();

        do {
            System.out.print("Apakah Anda ingin mengambil cuti(y/t)? ");
            confirmation = sc.next();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("Jumlah hari: ");
                numLeave = sc.nextInt();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.print("Sisa jatah cuti: " + leaveEntitlement);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                }
            }
        } while (confirmation.equalsIgnoreCase("y")); // Loop until the user enters "t".

       sc.close();
    }
}

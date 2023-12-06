package WEEK11;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        int i = 1; // Mulai dari 1
        while (i <= N) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println(); // Tambahkan baris baru setelah setiap baris bintang selesai dicetak
            i++;
        }
    }
}

package WEEK11;

import java.util.Scanner;

public class NestedLoop_2341720065 {
    public static void main(String[] args) {
        // Deklarasi Scanner
        Scanner scanner = new Scanner(System.in);

        // Deklarasi array 2 dimensi dengan jumlah baris 5 dan kolom 7
        double[][] temps = new double[5][7];

        // Input suhu untuk setiap kota dan hari
        for (int i = 0; i < temps.length; i++) {
            System.out.println("Kota ke-" + (i + 1));
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        // Menampilkan data suhu untuk setiap kota menggunakan foreach
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + " Rata-rata: ");
            double totalSuhu = 0;
            for (int j = 0; j < temps[0].length; j++) {
                totalSuhu += temps[i][j];
            }
            double rataRata = totalSuhu / temps[0].length;
            System.out.println(rataRata);
        }

        scanner.close();
    }
}
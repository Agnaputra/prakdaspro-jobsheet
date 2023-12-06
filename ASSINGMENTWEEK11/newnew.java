package ASSINGMENTWEEK11;
import java.util.Scanner;

public class newnew {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N (minimal 3): ");
        int N = sc.nextInt();

        if (N >= 3) {
            // Mencetak persegi angka
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (j == 0 || j == N - 1 || i == N / 2) {
                        System.out.print(N + "\t");
                    } else {
                        System.out.print("\t");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Nilai N harus minimal 3.");
        }

        sc.close();
    }
}
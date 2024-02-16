package ASSINGMENTWEEK11;

import java.util.Scanner;

public class AssingnmetPersegiAngka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc.nextInt();
        
        //validasi nilai N
        if (N < 3){
            System.out.println("Nilai N harus minimal 3. ");
            return;
        }

        //Mencetak pola angka
        for(int i = 1; i <= N;i++){
            for(int j = 1; j <= N; j++) {

                if (i == 1 || i == N || j == 1 || j == N) {
                    System.out.print(N + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}

package ASSINGMENTWEEK11;

import java.util.Scanner;

public class AssingmnetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         for (int h=0;h<5;h++) {
            
            int x = 1 ;
            for (int i=0;i<5;i++){
                if(i<5-h-1)
                    System.out.print(" ");
                else
                System.out.print(x++);
            }
            System.out.println();
         }
    }
}
    


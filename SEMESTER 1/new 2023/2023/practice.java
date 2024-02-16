import java.util.Scanner;
    
public class practice{
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);
       
    int x=1;
      
    System.out.println("input x : ");
    x = input01.nextInt();
       while(x<=5){
       
        System.out.println("nilai x kurang dari sama dengan 5. ");
        System.out.print("masukkan nilai lagi : ");
        x = input01.nextInt();
        
        }
        System.out.println("Nilai x lebih besar dari 5. ");
        input01.close();
       }
    }

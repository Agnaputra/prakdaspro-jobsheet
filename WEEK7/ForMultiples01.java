package WEEK7;
import java.util.Scanner;

public class ForMultiples01 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        int multiple, sum = 0, counter = 0;

        System.out.print("Input the multiple = ");
        multiple = input01.nextInt();

        for(int i=1 ; i<=50 ; i++){
            if(i%multiple == 0 ){
                sum = sum + i;
                counter++;
               // System.out.print(i+"-");
            }

        }   
        System.out.printf("There are %d numbers that are multiple of %d in range 1 to 50.\n",counter,multiple);
        System.out.printf("The sum from all multiples of %d in range 1 s.d. 50 is %d.\n",multiple,sum);
        double average = sum/counter;
        System.out.println("The average is "+average);

        input01.close();
     }
}

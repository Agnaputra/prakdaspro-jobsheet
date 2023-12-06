package WEEK7;

import java.util.Scanner;

public class WhileOvertimePay01 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        int numEmployee, overtimeHours;
        double overtimePay = 0, totalOvertimePay = 0;
        String position;
        
        //input numEmployee
        System.out.print("Employee number = ");
        numEmployee = input01.nextInt();
        
        int i=0;
        while(i<numEmployee){
            System.out.print("Position of employee "+(i+1)+" (director, manager, staff) =");
            position = input01.next();
            System.out.print("Employee "+(i+1)+" overtime hours = ");
            overtimeHours = input01.nextInt();
              i++;

            if(position.equalsIgnoreCase("director")){
             continue;   
            }else if(position.equalsIgnoreCase("manager")){
                overtimePay=overtimeHours*100000;
            }else if(position.equalsIgnoreCase("staff")){
                overtimePay=overtimeHours*75000;
            }else{
            i--;
            System.out.println("Invalid Position");
            continue;
            
            }
            totalOvertimePay += overtimePay;
          
            
            
        }
        System.out.print("Total of Overtime Pay = "+totalOvertimePay);

        input01.close();

    }
    
}

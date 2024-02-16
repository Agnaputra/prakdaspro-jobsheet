import java.util.Scanner;

public class Selection201 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);

        System.out.print("Nilai uas     : ");
        float FinalExam = input01.nextFloat();

        System.out.print("Nilai uts     : ");
        float midexam = input01.nextFloat();

        System.out.print("Nilai kuis    : ");
        float quiz = input01.nextFloat();

        System.out.print("Nilai tugas   : ");
        float assingment = input01.nextFloat();

        float total = (FinalExam * 0.4F ) + (midexam * 0.3F ) + (quiz * 0.1F ) + (assingment * 0.2F );
        String message = total < 65 ? "Retake" : "Pass";
        if (total > 80 && total <= 100) {
            message = "A";
        } else if (total > 73 && total <= 80) {
            message = "B+";
        } else if (total > 65 && total <= 73) {
            message = "B";
        } else if (total > 60 && total <= 65) {
            message = "C+";
        } else if (total > 50 && total <= 60) {
            message = "C";
        } else if (total > 39 && total <= 50) {
            message = "D";
        } else {
            message = "E";
        }
 
        System.out.println("Final Grade = " + message);
        System.out.println("Final Grade = " + total + "and the decission is " + message);
        
        input01.close();
    }
}



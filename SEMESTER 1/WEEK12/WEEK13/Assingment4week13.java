package WEEK13;

public class Assingment4week13 {
   
        public static int guineaPigs(int n) {
            if (n == 0) {
                return 0; 
            } else if (n == 1) {
                return 1;
            } else {
                return guineaPigs(n-1) + guineaPigs(n-2);
            }
        }
    
        public static void main(String[] args) {
           System.out.println(guineaPigs(12));; 
        }
    
    }
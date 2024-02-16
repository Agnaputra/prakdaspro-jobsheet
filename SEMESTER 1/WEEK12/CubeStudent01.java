package WEEK12;

public class CubeStudent01 {
    static double calculateArea(double side) {
        double area = 0;
        area = 6 * side * side;
        return area;
    }
    static double calculateVolume(double side) {
        double volume = 0 ;
        volume = side * side * side;
        return volume;
    }
    public static void main(String[] args) {
        double area = calculateArea(10);
        double volume = calculateVolume(10);
    }

    
}
       


public class ExampleVariable01 {

    public static void main(String[] args) {
    
        String oneOFMyHobbies = "Singing";
        boolean isSmart = true;
        char gender = 'M';
        byte _age = 20;
        double $gpa = 3.88, height = 1.70;
        System.out.println(oneOFMyHobbies);
        System.out.println("Are you smart ?" + isSmart);
        System.out.println("Gender: "+gender);
        System.out.println("My current age is "+ _age);
        System.out.println(String.format("My GPA is %s and my height is %s meters", $gpa, height));
        

    }   
}
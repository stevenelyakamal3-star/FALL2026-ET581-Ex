
import java.util.Scanner;

public class StudyingMaterial {

    public static void main(String args []){

        System.out.println("Enter student information: ");
        Scanner input = new Scanner(System.in);
        int age;
        age = input.nextInt();
        System.out.println("Age: " + age);
        double height;
        height = input.nextDouble();
        System.out.println("Height: " + height);
       
        char grade; 
        grade = input.next().charAt(0);
        System.out.println("Grade: " + grade);
        double weight;
        weight = input.nextDouble();
        System.out.println("Weight: " + weight);
        int Number;
        Number = input.nextInt();
        System.out.println("Number of Classes: " + Number);
        boolean student = true;
        System.out.println("Student: " + student);
        System.out.println("Enter test scores: ");
        int numberone;
        numberone = input.nextInt();
        System.out.println("Score 1: " + numberone);
        
        int numbertwo;
        numbertwo = input.nextInt();
        System.out.println("Score 2: " + numbertwo);
        
        int numberthree;
        numberthree = input.nextInt();
        System.out.println("Score 3: " + numberthree);
        double Average = (numberone + numbertwo +numberthree)/3.0;
        System.out.println("Average: " + Average);
        System.out.println("Enter a four-digit integer: ");
        int number;
        number = input.nextInt();
        System.out.println("first digit: " + number/1000);
        System.out.println("second digit: " + (number/100) % 10);
        System.out.println("third digit: " + (number/10) % 10);
        System.out.println("fourth digit: " + number % 10);



        
        
        
        
        
        
        
        
        input.close();






    }
    
}

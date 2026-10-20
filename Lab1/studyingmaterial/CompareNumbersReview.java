import java.util.Scanner;
public class CompareNumbersReview {
    public static void main(String[] args){
        System.out.println("Enter first number: ");
        Scanner input = new Scanner(System.in);
        int numberone;
        numberone = input.nextInt();
        System.out.println("Enter second number: ");
        int numbertwo;
        numbertwo = input.nextInt();
        System.out.println("First number is greater than or equal to second: " + (numberone>=numbertwo));
        System.out.println("First number is less than or equal to second: " + (numberone<=numbertwo));
        System.out.println("Numbers are not equal: " + (numberone != numbertwo) );
    }
    
}

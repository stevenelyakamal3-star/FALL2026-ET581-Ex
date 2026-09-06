
import java.util.Scanner;



public class EachDigitSeparately {
    public static void main(String []args){
        System.out.println("Enter a 4-digit integer: ");
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
        System.out.println("First digit: " + number / 1000);
        System.out.println("Second digit: " + (number/100) % 10);
        System.out.println("Third digit: " + (number/10) % 10);
        System.out.println("Fourth digit: " + number % 10);

        input.close();



    }
}

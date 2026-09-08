
import java.util.Scanner;



public class EachDigitSeparately {
    public static void main(String []args){
        System.out.println("Enter a 4-digit integer: ");
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
        System.out.println("first digit: " + number / 1000);
        System.out.println("second digit: " + (number/100) % 10);
        System.out.println("third digit: " + (number/10) % 10);
        System.out.println("fourth digit: " + number % 10);

        input.close();



    }
}

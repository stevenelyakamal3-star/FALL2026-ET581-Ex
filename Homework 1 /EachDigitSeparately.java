
import java.util.Scanner;//step 2: I am importing the scanner util option in order to use this to take in any input the user enters
 



public class EachDigitSeparately { //step 1: created the EachDigitSeparately class
    public static void main(String []args){ //step 3: created the main method where the body of the program is going to be written.
        System.out.println("Enter a 4-digit integer: "); //step 4: wrote an input statement prompting the user to enter a 4-digit integer. 
        Scanner input = new Scanner(System.in);//step 5: created a scanner object in order to read input from the keyboard.
        int number; //step 6: created the variable number as an integer variable
        number = input.nextInt(); //step 7: read an integer by the user and store it in number
        System.out.println("first digit: " + number / 1000);//step 8: printed out the label first digit and the the value stored in number divided by 1000.
        System.out.println("second digit: " + (number/100) % 10);//step 9: printed out the label second digit and the value stored in number divided by 100 modulus 10
        System.out.println("third digit: " + (number/10) % 10);//step 10: printed out the label third digit and the value stored in number divided by 10 modulus 10
        System.out.println("fourth digit: " + number % 10); //step 11: printed out the label fourth digit and the value stored in number modulus 10

        input.close();//step 12: closed the scanner object because it is no longer needed.



    }
}

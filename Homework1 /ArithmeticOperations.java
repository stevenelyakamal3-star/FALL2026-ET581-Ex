import java.util.Scanner;  //step 3: I am importing the scanner util option in order to use this to take in any input the user enters

public class ArithmeticOperations { //Step 1: created the ArithmeticOperations class
    public static void main(String []args){ //Step 2: created the main method for where i will be writing the body of my program.


        System.out.println("Enter score 1: "); //Step 4: created the first input statement prompting the user to enter the first score
        Scanner input = new Scanner(System.in); //step 5: created a scanner object to read input from the keyboard
        int score1; //step 6: declared the variable score1 as an integer variable
        score1 = input.nextInt(); //step 7: read an integer entered by the user and stored it in score1
        
        System.out.println("Enter score 2: "); //step 8: created the second input statement prompting the user to enter score 2.
        int score2; //step 9: declared the variable score2 as an integer variable
        score2 = input.nextInt(); //step 10: read an integer entered by the user and stored it in score2
        
        System.out.println("Enter score 3: "); //step 11: created the third input statement prompting the user to enter score 3.
        int score3; //step 12: declared the variable score3 as an integer variable
        
        score3 = input.nextInt(); //step 13: read an integer entered by the user and stored it in score3
        
        
         
        double ave = (score1 +score2 + score3)/3.0; //step 14: calculated the average of all three scores as a double
        System.out.println("Average score: " + ave); //step 15: printed the average which is the output of the whole program
        input.close(); //step 16: closed the scanner object because it is no longer needed



    }    
}

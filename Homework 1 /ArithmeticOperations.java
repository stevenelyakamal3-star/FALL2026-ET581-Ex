import java.util.Scanner;  //step 3: I am importing the scanner util option in order to use this to take in any input the user enters

public class ArithmeticOperations { //Step 1: created the folder Homework 1 and the file within the folder named ArithmeticOperations.java
    public static void main(String []args){ //Step 2: created the main method for where i will be writing the body of my program.


        System.out.println("Enter score 1: "); //Step 4: created the first input statement prompting the user to enter the first score
        Scanner input = new Scanner(System.in); //step 5: used the scanner input statement to read in the input or take in and store the input
        int score1; //step 6: declared the variable score1 as an integer variable
        score1 = input.nextInt(); //step 7 stored the variable score1 as integer for input
        
        System.out.println("Enter score 2: "); //step 7: created the second input statement prompting the user to enter score 2.
        int score2; //step 8: declared the variable score2 as an integer variable
        score2 = input.nextInt(); //step 9: stored the variable score2 as integer for input
        
        System.out.println("Enter score 3: "); //step 10: created the third input statement prompting the user to enter score 3.
        int score3; //step 11: declared the variable score3 as an integer variable
        
        score3 = input.nextInt(); //step 12: stored the variable score3 as integer for input 
        
        
        double ave; //step 13: declared variable ave as double
        ave = (score1 +score2 + score3)/3.0; //step 14: calculated ave
        System.out.println("Average score: " + ave); //step 15: printed the average which is the output of the whole program
        input.close(); //step 16: closed the input statement meaning no longer in use anymore



    }    
}

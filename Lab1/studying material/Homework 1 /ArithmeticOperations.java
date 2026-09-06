import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String []args){


        System.out.println("Enter score 1: ");
        Scanner input = new Scanner(System.in);
        int score1;
        score1 = input.nextInt();
        System.out.println("Score 1: " + score1);
        System.out.println("Enter score 2: ");
        int score2;
        score2 = input.nextInt();
        System.out.println("Score 2: " + score2);
        System.out.println("Enter score 3: ");
        int score3;
        
        score3 = input.nextInt();
        System.out.println("Score 3: " + score3);
        
        double ave;
        ave = (score1 +score2 + score3)/3;
        System.out.println("Average score: " + ave);
        input.close();



    }    
}

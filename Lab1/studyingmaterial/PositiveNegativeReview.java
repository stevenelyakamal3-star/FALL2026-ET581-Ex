import java.util.Scanner;



public class PositiveNegativeReview {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();
        if (number>0){
            System.out.println("Positive number");

        }
        else{
            System.out.println("Negative number");
            
        }
    }
    
}

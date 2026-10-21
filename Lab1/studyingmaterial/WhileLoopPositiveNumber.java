
import java.util.Scanner;

public class WhileLoopPositiveNumber {
    public static void main(String[] args){
        
       
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        while (num>=100){
            System.out.println("Enter a number: ");
            num = input.nextInt();
           
            
            
            
           
        }
        System.out.println("Valid Number!");

        
    }    
}

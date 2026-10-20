
import java.util.Scanner;


public class StringCheckIndexReview {
    public static void main(String[] args){
        System.out.println("Enter a sentance: ");
        Scanner input = new Scanner(System.in);
        String sentance;
        sentance = input.nextLine();
        String upper = sentance.toUpperCase();
        String lower = sentance.toLowerCase();
        int length = sentance.length();
        System.out.println("Original: " + sentance);
        System.out.println("UpperCase: " + upper);
        System.out.println("LowerCase: " + lower);
        System.out.println("Length: " + length);
        input.close();
    }
    
}

import java.util.Scanner;
public class CompareStringsReview {
    public static void main(String[] args){
        System.out.println("Enter the first string: ");
        Scanner input = new Scanner(System.in);
        String wordone;
        wordone = input.nextLine();
        System.out.println("Enter the second string: ");
        String wordtwo;
        wordtwo = input.nextLine();
        boolean result = wordone.equalsIgnoreCase(wordtwo);
        System.out.println(result);
    }
    
}

import java.util.Scanner;


public class CompareToStringsReview {
    public static void main(String[] args){
        System.out.println("Enter string one: ");
        Scanner input = new Scanner(System.in);
        String wordone;
        wordone = input.nextLine();
        System.out.println("Enter string two: ");
        String Wordtwo;
        Wordtwo = input.nextLine();
        Boolean result = wordone.equalsIgnoreCase(Wordtwo);
        System.out.println(result);
    }    
}

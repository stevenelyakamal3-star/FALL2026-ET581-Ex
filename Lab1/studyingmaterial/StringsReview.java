
import java.util.Scanner;
public class StringsReview {
    public static void main(String[] args){
        System.out.println("Enter a word or a sentance: ");
        Scanner input = new Scanner(System.in);
        String word;
        word = input.nextLine();
        String result = word.toUpperCase();
        System.out.println(result);
        input.close();
    }

}

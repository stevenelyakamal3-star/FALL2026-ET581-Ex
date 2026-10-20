import java.util.Scanner;
public class AndOperatorReview {
    public static void main(String[] args){
        System.out.println("Enter Test score: ");
        Scanner input = new Scanner(System.in);
        int score;
        score = input.nextInt();
        boolean result = (score>=70) && (score<=100);
        System.out.println(result);
        input.close();
    }
    
}

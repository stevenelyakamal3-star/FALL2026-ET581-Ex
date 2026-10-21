import java.util.Scanner;

public class EvenOddTernaryReview {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        boolean isNumberpositive = (num>0)? true:false;
        System.out.println(isNumberpositive);
    }
    
}

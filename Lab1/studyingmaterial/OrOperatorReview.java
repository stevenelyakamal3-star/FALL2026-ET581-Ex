import java.util.Scanner;



public class OrOperatorReview {
    public static void main(String[] args){
        System.out.println("Enter month number: ");
        Scanner input = new Scanner(System.in);
        int month;
        month = input.nextInt();
        boolean result = month ==66 || month == 7 ||month == 8;
        System.out.println("Has school break: " + result);
        input.close();
    }
    
}

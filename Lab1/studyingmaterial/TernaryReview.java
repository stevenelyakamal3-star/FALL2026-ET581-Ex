import java.util.Scanner;
public class TernaryReview {
    public static void main(String[] args){
        System.out.println("Enter purchase amount: ");
        Scanner input = new Scanner(System.in);
        int amount;
        amount = input.nextInt();
        String ispurchaseamount = (amount>=50)? "Free shipping":"Shipping fee applies";
        System.out.println(ispurchaseamount);
        input.close();
    }    
}

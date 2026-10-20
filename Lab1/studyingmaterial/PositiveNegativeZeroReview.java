import java.util.Scanner;


public class PositiveNegativeZeroReview {
    public static void main(String[] args){
        System.out.println("Enter temperature: ");
        Scanner input = new Scanner(System.in);
        int temp;
        temp = input.nextInt();
        if (temp>30){
            System.out.println("Hot");

        }
        else if(temp>15 && temp<=30){
            System.out.println("Warm");

        }
        else{
            System.out.println("Cold");
        }
    }    
}

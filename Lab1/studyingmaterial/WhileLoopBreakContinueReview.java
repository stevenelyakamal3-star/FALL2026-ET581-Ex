import java.util.Scanner;

public class WhileLoopBreakContinueReview {
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num;
        num = input.nextInt();
        while(true){
            System.out.println("Enter a number: ");
            num = input.nextInt();
            if (num==5){
                continue;
            }
            if (num==99){
                break;
            }
            }
            System.out.println("Program stopped!");
        }
    }    


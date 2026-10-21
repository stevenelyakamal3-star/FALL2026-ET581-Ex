import java.util.Scanner;
public class ForLoopReview {
    
    public static void main(String[] args){
    
    System.out.println("Enter an integer: ");
    Scanner input = new Scanner(System.in);
    int num;
    num = input.nextInt();
    for (int i = 0; i <=num; i++){
        System.out.println("Java is fun!");
    }
    }
}

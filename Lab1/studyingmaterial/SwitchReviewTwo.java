import java.util.Scanner;
public class SwitchReviewTwo {
    public static void main(String[] args){
        System.out.println("Enter length: ");
        Scanner input = new Scanner(System.in);
        int length;
        length = input.nextInt();
        System.out.println("Enter width: ");
        int width;
        width = input.nextInt();
        System.out.println("Enter operator: ");
        char operator;
        operator = input.next().charAt(0);
        switch(operator){
            case '*':
                int area = length * width;
                System.out.println(area);
                break;
            case '+':
                int perimeter = 2 *(length +width);
                System.out.println(perimeter);
                break;

        }


    }    
}

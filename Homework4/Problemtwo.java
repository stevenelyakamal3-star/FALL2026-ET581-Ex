
import java.util.Scanner;



public class Problemtwo {
    public static void main(String[] args){
        System.out.println("Enter a character: ");
        Scanner input = new Scanner(System.in);
        char symbol;
        symbol = input.nextLine().charAt(0);
        System.out.println("Enter number of rows: ");
        int row;
        row = input.nextInt();
        
        for (int i = 0; i<row; i++){
            for(int j = 0; j<=i; j++){
                System.out.print(symbol);

            }
            System.out.println();
    
    
        }

        input.close();
    }
    
}

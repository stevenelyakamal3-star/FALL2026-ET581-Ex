
import java.util.Scanner;



public class StudyingMaterial{
    public static void main(String[] args){

        System.out.println("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int number;
        number = input.nextInt();


        for (int i = 0; i<=number; i++){
            for(int j = i; j<=number; j++){

                System.out.print(number);
            }
            System.out.println();
            
        }
        
        


    }        

}

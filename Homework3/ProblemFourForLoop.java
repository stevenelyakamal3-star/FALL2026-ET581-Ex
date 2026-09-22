
import java.util.Scanner;



public class ProblemFourForLoop {
    public static void main(String[] args){
        System.out.println("Input: ");
        Scanner input = new Scanner(System.in);

        String word;
        word = input.nextLine();

        boolean foundduplicate = false;
        for(int i = 0; i <word.length()-1;i++){
            if (word.charAt(i)== word.charAt(i+1)){
                foundduplicate = true;
                break;

            }
        }
        
        if(foundduplicate){
            System.out.println("Has consecutive duplicate.");

        }
        else{
            System.out.println("No consecutive duplicate.");
        }
        
        
        input.close();

    }
    
}

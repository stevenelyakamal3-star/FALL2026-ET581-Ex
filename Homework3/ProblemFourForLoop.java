
import java.util.Scanner;



public class ProblemFourForLoop {
    public static void main(String[] args){
        System.out.println("Input: ");
        Scanner input = new Scanner(System.in);

        String word;
        word = input.nextLine();

        boolean foundduplicate = false;//declared boolean variable found duplicate in order to determine whether or not the word that the user types has a consecutive duplicate letter before initiating the loop.
        for(int i = 0; i <word.length()-1;i++){
            if (word.charAt(i)== word.charAt(i+1)){//comparing the characters of the word that the user inputs that are next to each other whether they are equal to each other or not and if the letters are found to be equal then the word has a consecutive duplicate letter so we set the boolean variable found duplicate to be true in the loop 
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

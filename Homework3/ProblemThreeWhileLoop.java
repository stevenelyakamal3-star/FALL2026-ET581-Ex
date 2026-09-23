
import java.util.Scanner;



public class ProblemThreeWhileLoop {

    public static void main(String[] args){
        System.out.println("Input: ");
        Scanner input = new Scanner(System.in);
        String word;
        word = input.nextLine();
        
    
        
        
        int position = 0;

        

        String result = ""; //declaring the variable result as a string so we can store the actual resulting word that is produced as output when the user enters a word with the stars depending on whether the word has character e in it

        
        while(position<word.length()){

            char currentcharacter = word.charAt(position);

            if (currentcharacter == 'e'){//every word that has a character 'e' is replaced with a star and thats if the word has a character 'e' in it.
                result = result + '*'; // we are adding a star to result if the word has character 'e' in it.




            }
            else{
                result = result + currentcharacter;//if the word does not contain the character 'e' in it then the current character is added to the result
            }
            position++;


        }
        System.out.println("Output: " + result);


        input.close();





    }
}


import java.util.Scanner;



public class ProblemThreeWhileLoop {

    public static void main(String[] args){
        System.out.println("Input: ");
        Scanner input = new Scanner(System.in);
        String word;
        word = input.nextLine();
        
    
        
        
        int position = 0;

        

        String result = "";

        
        while(position<word.length()){

            char currentcharacter = word.charAt(position);

            if (currentcharacter == 'e'){
                result = result + '*';



            }
            else{
                result = result + currentcharacter;
            }
            position++;


        }
        System.out.println("Output: " + result);


        input.close();





    }
}

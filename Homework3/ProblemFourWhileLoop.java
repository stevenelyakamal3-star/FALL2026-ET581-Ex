

import java.util.Scanner;




public class ProblemFourWhileLoop {
    public static void main(String[] args){
        System.out.println("Input: ");
        Scanner input = new Scanner(System.in);
        String word;
        word = input.nextLine();

        int i = 0;
        boolean foundduplicate = false;
        while(i < word.length() -1){
            if (word.charAt(i) == word.charAt(i+1)){
                foundduplicate = true;
                break;



            }
            i++;



        }

        if (foundduplicate){
            System.out.println("Has consecutive duplicate.");
        }
        else{
            System.out.println("No consecutive duplicate.");
        }


        input.close();





    }
    
}

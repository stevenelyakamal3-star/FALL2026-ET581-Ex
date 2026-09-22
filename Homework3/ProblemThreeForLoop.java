


import java.util.Scanner;

public class ProblemThreeForLoop {
    public static void main(String[] args){


        System.out.println("Input: ");
        Scanner input = new Scanner(System.in);
        String word;
        word = input.nextLine();

        String result = "";


        for(int position = 0; position<word.length(); position ++){

            char currentcharacter;
            currentcharacter = word.charAt(position);

            if (currentcharacter == 'e'){

                result = result+'*';
            }
            else{
                result = result + currentcharacter;


            }
            


        }

        System.out.println("Output: " + result);








    }    
}


import java.util.Scanner;

public class StudyingMaterial {

    public static void main(String args []){

        System.out.println("Input: ");
        Scanner input = new Scanner(System.in);
        String word;
        word = input.nextLine();
        boolean onlylowercase = true;
        boolean isdecreasing = true;
        for(int i = 0; i<word.length(); i++){
           
           if(!Character.isLowerCase(word.charAt(i)))
            onlylowercase = false;
           
           
           
           
            if (i<word.length()-1){
                if (word.charAt(i)<= word.charAt(i+1)){

                    isdecreasing = false;

                }





            }



        }
        if (!onlylowercase){
            System.out.println("Invalid");


        }
        else if (isdecreasing){
            System.out.println("Decreasing order");

        }
        else{
            System.out.println("Not decreasing order");
        }
        


        
        
        
        
        
        
        
        
        input.close();






    }
    
}

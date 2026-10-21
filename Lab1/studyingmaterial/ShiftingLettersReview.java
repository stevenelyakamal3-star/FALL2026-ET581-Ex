
import java.util.Scanner;

public class ShiftingLettersReview {
    public static void main(String[] args){
        System.out.println("Input: ");
        Scanner input = new Scanner(System.in);
        String word;
        word = input.nextLine();
        char Character;
        int length = word.length();
        int index =0;
        while(index<word.length()){
            Character = word.charAt(index);
            int Alphabetposition = Character - 'A';
            int newposition = (Alphabetposition +4)%26;
            char newCharacter = (char)('A'+newposition);
            System.out.print(newCharacter);
            index++;
        }
        System.out.println();
        

    }
    
}

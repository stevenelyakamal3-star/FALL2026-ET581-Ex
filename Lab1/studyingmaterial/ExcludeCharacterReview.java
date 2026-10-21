import java.util.Scanner;

public class ExcludeCharacterReview {
    public static void main(String[] args){
        System.out.print("Enter a word: ");
        Scanner input = new Scanner(System.in);
        String word;
        word = input.nextLine();
        System.out.println("Character to search for: ");
        char Character;
        Character = input.nextLine().charAt(0);
        int length = word.length();
        int index = 0;
        while (index<word.length()){
            if(word.charAt(index)==Character){
                System.out.print(word.charAt(index));

            }
            index++;
        }
        System.out.println();
    }
    
}

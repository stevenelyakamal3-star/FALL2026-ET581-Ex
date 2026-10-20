import java.util.Scanner;
public class CompareTwoWordsReview {
    public static void main(String[] args){
        System.out.println("Enter first word: ");
        Scanner input = new Scanner(System.in);
        String word;
        word = input.nextLine();
        System.out.println("Enter second word: ");
        String wordTwo;
        wordTwo = input.nextLine();
        if (word.compareTo(wordTwo)<0){
            System.out.println(word + " comes before " + wordTwo);

        }
        else if(word.compareTo(wordTwo) == 0){
            System.out.println("Both words are equal.");
        }
        else{
            System.out.println(word  + " comes after " + wordTwo);
        }
    }
    
}

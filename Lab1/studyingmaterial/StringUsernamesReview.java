import java.util.Scanner;
public class StringUsernamesReview {
    public static void main(String[] args){
        System.out.println("Enter username:    ");
        Scanner input = new Scanner(System.in);
        String username;
        username = input.nextLine();
        
        System.out.println("Original username: " + username);
        System.out.println("Original length: " + username.length());
        String result = username.trim();
        int newLength = result.length();

        System.out.println("\nCleaned username: " + result);
        System.out.println("New Length: " + newLength);

    }    
}

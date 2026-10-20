import java.util.Scanner;



public class StringCheckPasswordReview {
    public static void main(String[] args){
        System.out.println("Enter password: ");
        Scanner input = new Scanner(System.in);
        String password;
        password = input.nextLine();
        Boolean result = password.equals("Tiger2026");
        System.out.println(result);
        input.close();
    
    }
    
}

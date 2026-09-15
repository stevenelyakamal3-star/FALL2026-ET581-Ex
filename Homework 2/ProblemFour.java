
import java.util.Scanner;
import java.util.StringTokenizer;



public class ProblemFour {
    public static void main(String []args){
        System.out.println("Enter two words: ");
        Scanner input = new Scanner(System.in);
        String sentance;
        sentance = input.nextLine();
        StringTokenizer st1;
        st1 = new StringTokenizer(sentance);
        String firstword = st1.nextToken();
        String secondword = st1.nextToken();
        System.out.println("First word: " + firstword);
        System.out.println("Second word: " + secondword);
        System.out.println("Enter a separator(+, -, *): ");
        char sep;
        sep = input.next().charAt(0);
        if (sep == '+'){
            System.out.println(firstword + "+" + secondword);
        




        }
        else if (sep == '-'){
            System.out.println(firstword + "-" + secondword);



        } 
        else if (sep == '*'){
            System.out.println(firstword + "*" + secondword);
        }
        else{
            System.out.println("Not valid separater.");
        }
        
        
        
        
        input.close();

    }   
}


import java.util.StringTokenizer;

public class StringTokenizerReview {
     public static void main(String[] args){
        String sentance = "Cyber security is important for everyone";
        StringTokenizer st1 = new StringTokenizer(sentance);
        System.out.println(st1.nextToken());
        System.out.println(st1.nextToken());
        System.out.println(st1.nextToken());
        System.out.println(st1.nextToken());
        System.out.println(st1.nextToken());
        System.out.println(st1.nextToken());

     }    
}

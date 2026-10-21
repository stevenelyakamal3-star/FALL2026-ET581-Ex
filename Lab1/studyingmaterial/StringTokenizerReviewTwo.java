
import java.util.StringTokenizer;

public class StringTokenizerReviewTwo {
    public static void main(String[] args){
        String data = "David, Sarah, Michael, Rebecca";
        StringTokenizer str1 =  new StringTokenizer(data, ","); 
        System.out.println(str1.nextToken());
        System.out.println(str1.nextToken());
        System.out.println(str1.nextToken());
        System.out.println(str1.nextToken());
        
    }    
}

public class ProblemThree {
    public static void main(String []args){
        String word = "banana";
        
        boolean firstcheck = word.compareToIgnoreCase("apple")>= 0;
        boolean secondcheck = word.compareToIgnoreCase("mango")<=0;
        
        boolean result = firstcheck && secondcheck;
        System.out.println(result);

    }
    
}

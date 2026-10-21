public class WhileLoopsReverseOrderReview {
    public static void main(String[] args){
        String word = "Security";
        int wordlength = word.length();
        int index = 7;
        while (index>=0){
            System.out.print(word.charAt(index));
            index--;
        }
        System.out.println();
    }    
}

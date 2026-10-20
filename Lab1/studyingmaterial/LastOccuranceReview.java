public class LastOccuranceReview {
    public static void main(String[] args){
        String words = "dog cat dog bird dog";
        int result = words.lastIndexOf("dog", 17);
        System.out.println("Last dog starts at index: " + result);
        
    }
    
}

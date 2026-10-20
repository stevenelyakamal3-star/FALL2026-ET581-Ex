public class FirstSecondOccuranceStringReview {
    public static void main(String[] args){
        String words = "Cat Dog Cat Bird Cat";

        int firstoccurance = words.indexOf("Cat", 0);
        int secondoccurance = words.indexOf("Cat", 8);
        System.out.println("Second 'Cat' starts at index: " + secondoccurance);
    }
    
}

public class CompareTwoIgnoreCase {
    public static void main(String[] args){
        String wordone = "CyberSecurity";
        String wordTwo = "CYBERSECURITY";
        
        if (wordone.compareToIgnoreCase(wordTwo)== 0){
            System.out.println("The strings are equal when case is ignored.");

        }
        else if(wordone.compareToIgnoreCase(wordTwo)<0){
            System.out.println("The string returns a negative integer.");
        } 
        else{
            System.out.println("The string returns a positive integer.");
        }
    }
    
}

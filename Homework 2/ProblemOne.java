

public class ProblemOne {
    public static void main(String []args){

        String text = "I like Apple pie";
        
        String lowertext = text.toLowerCase();
        


        int position = lowertext.indexOf("apple");
        
        String result = text.substring(position);
        System.out.println(result);



    }    
}

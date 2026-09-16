

public class ProblemOne {
    public static void main(String []args){

        String text = "I like Apple pie";
        
        String lowertext = text.toLowerCase(); //declaring variable lowertext as a string variable and converting the string stored in the variable text to lowercase
        


        int position = lowertext.indexOf("apple"); //declaring the variable position as an int and converting the string stored 
        
        String result = text.substring(position); //declaring string variable result and extracting substring of text from index start position to end
        System.out.println(result);



    }    
}

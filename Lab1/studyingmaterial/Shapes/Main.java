

public class Main {
    public static void main(String[] args){
        Shapes[] s1 = { new Shapes(10, 5),
                        new Shapes(10, 5),
                        new Shapes(50, 20),
                        new Shapes(40, 30),
                        new Shapes(30, 30)
        };
                        
        for (int i = 0; i <s1.length; i++){
            if(s1[i].getlength() == s1[i].getwidth()){
                System.out.println("The shape is a square.");
            } 
            else{
                System.out.println("The current shape is a rectangle.");
            }
        }
        System.out.println(s1[0]);
        System.out.println(s1[0].equals(s1[1]));

    }    
}

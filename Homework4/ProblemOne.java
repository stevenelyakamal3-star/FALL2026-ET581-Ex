

public class ProblemOne {
    public static void print(){
        int n = (int)(Math.random()*10);
        System.out.println(" " +n); 
    }
    public static void print(int count){
        for (int i = 0; i<count; i++){

             int n = (int)(Math.random()*10);
             System.out.print(" " +n+ " ");
        }
    }
    public static void print(int count, int rows){
        for (int i = 0;i<rows; i++){
            for(int j = 0; j<count; j++){
                int x = (int)(Math.random()*10);
                System.out.print(" " +x+ " ");
             }
            System.out.println();
        }
    }
public static void main(String[] args){
        print();
        print(5);
        System.out.println();
        print(4,3);


    }
}

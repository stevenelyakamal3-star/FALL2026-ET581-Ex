public class ProblemTwoForLoop {
    public static void main(String[] args){

        int sum =0;
        for (int num = 1; num<101; num++){
            sum = num + sum;
            
        }

        System.out.println("Sum: " + sum);
        

    }    
}

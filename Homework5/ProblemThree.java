import java.util.Scanner;
public class ProblemThree {
    static int findMax(int[] numbers){
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }
    static int findMin(int[] numbers){
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        System.out.println("Enter array size: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i<size; i++){
            int num = (int)(Math.random() * 101);
            numbers[i] = num;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("Maximum: " + findMax(numbers));
        System.out.println("Minimum: " + findMin(numbers));
    }    
}

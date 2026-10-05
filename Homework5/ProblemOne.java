public class ProblemOne {
    static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void main(String[] args){
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.print("Before: ");
        for (int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        swap(numbers, 1, 3);
        System.out.print("\nAfter: ");
        for (int j = 0; j<numbers.length; j++){
            System.out.print(numbers[j] + " ");
        }
        System.out.println();
    }    
}

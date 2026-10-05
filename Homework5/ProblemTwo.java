public class ProblemTwo {
    static void bubbleSort(String[] words){
        for (int i = 0; i <words.length - 1; i++){
            for (int j = 0; j<words.length - 1 - i; j++){
                if (words[j].compareTo(words[j+1]) > 0){
                    String temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        String[] words = {"banana", "apple", "cherry", "date", "fig"};
        System.out.print("Before: ");
        for(int i = 0; i<words.length; i++){
            System.out.print(words[i] + " ");
        }
        bubbleSort(words);
        System.out.print("\nAfter: ");
        for(int j = 0; j<words.length; j++){
            System.out.print(words[j] + " ");
        }
        System.out.println();
    }
}

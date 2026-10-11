public class Main {
    public static void main(String[] args){
        Employee e1 = new Employee(101, "Alice", 5000);
        Employee e2 = new Employee(102, "Bob", 6500);
        Employee e3 = new Employee(103, "Charlie", 5500.0);
        System.out.println("Employee Details: ");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        Employee e4 = new Employee(101, "David", 7000.0);
        System.out.println("\nTesting equals():");
        System.out.println(e1.equals(e4));
     }
}

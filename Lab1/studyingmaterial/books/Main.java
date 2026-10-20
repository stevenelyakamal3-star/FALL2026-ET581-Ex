

public class Main {
    public static void printBooks(Books[] books){
        for (int i = 0; i <books.length; i++){
            System.out.println(books[i]);
        }


    }
    public static void sortBooks(Books[] books){
        for (int i = 0; i<books.length - 1; i++){
            for (int j = 0; j<books.length -1-i; j++){
                if(books[j].compareTo(books[j+1])> 0){
                    Books temp = books[j];
                    books[j] = books[j+1];
                    books[j+1] = temp;



                }
                
                
            }
        }

    }
    
    public static void main(String[] args){
        Books b1 = new Books("Java Basics" ,25.00);
        Books b2 = new Books("Java Basics", 25.00);
        Books b3 = new Books("Python guide", 30.00);
        System.out.println(b1);
        System.out.println(b1.equals(b2));
        System.out.println(b1.equals(b3));
        System.out.println(Books.count);
        Books b4 = new Books("Star wars", 20.00);
        b4.setTitle("Beauty and the beast");
        b4.setPrice(30.00);
        System.out.println(b4.getTitle());
        System.out.println(b4.getPrice());
        Books b5 = new Books("Star wars episode three", 10.00);
        Books b6 = new Books( "Star wars episode four", 25.00);
        System.out.println(b5.compareTo(b6));
        System.out.println(b6.compareTo(b5));
        Books[] books = new Books[5];
        books[0] = new Books("Algorithms", 45.00);
        books[1] = new Books("Databases", 30.00);
        books[2] = new Books("Networking", 20.00);
        books[3] = new Books("Cybersecurity", 40.00);
        books[4] = new Books("Linux Guide", 15.00);
        sortBooks(books);
        printBooks(books);



        

    }    
}

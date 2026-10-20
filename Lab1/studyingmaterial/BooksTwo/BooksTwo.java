

public class BooksTwo {
    String title;
    int pages;
    
BooksTwo(String title, int pages){
    this.title = title;
    this.pages = pages;
    }
    public static BooksTwo[] filterPages(BooksTwo[] books){
        int count = 0;
        for (int i = 0; i <books.length; i++){
            if (books[i].pages< 300){
                count++;
            }
            

        }
        BooksTwo[] result = new BooksTwo[count];
        int index = 0;
        for (int i = 0; i <books.length; i++){
            if(books[i].pages <300){
                result[index] = books[i];
                index++;
            }
        }
        return result;
    }
    void displayinfo(){
        System.out.println(this.title +", " + this.pages);
    }
    public static void main(String[] args){
        BooksTwo[] books = {
            new BooksTwo("Java Basics", 250),
            new BooksTwo("CyberSecurity Guide", 420),
            new BooksTwo("Python for Begginers", 180),
            new BooksTwo("Network Defense", 300),
            new BooksTwo("Computer Science Essentials", 275),
            new BooksTwo("Avanced Programming", 510)
        };
        BooksTwo[] result = BooksTwo.filterPages(books);
        for (int i = 0; i <result.length; i++){
            result[i].displayinfo();
        }
    }
}

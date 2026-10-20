

public class Books {
    private String title;
    private double price;
    static int count;
    public Books(String title){
        
        this.title = title;
        
        
        count++;


    }
    public Books(String title, double price){
        this.title = title;
        this.price = price;
        count++;
    }
    public String getTitle(){
        return title;

    }
    public double getPrice(){
        return price;
    }
    public void setTitle(String title){
        this.title= title;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String toString(){
        return this.title + ", " + this.price;
    }
    public boolean equals(Books b){
        return (b.title.equals(title) && b.price == price);
    }
    public int compareTo(Books b){
        return (int)(this.price - b.price);
    }
    
}

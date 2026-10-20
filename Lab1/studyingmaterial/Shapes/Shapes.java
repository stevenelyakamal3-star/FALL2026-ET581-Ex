

public class Shapes {
   private int length;
    private int width;
    private int area;

    
    Shapes(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int getlength(){
        return length;


    }
    public int getwidth(){
        return width;
    }
    public void setlength(int l){
        length =l;
    }
    public void setwidth(int w){
        width = w;
    }
    public int getarea(){
        return length*width;
    }   
    public String toString(){
        return this.getlength() + ", " + this.getwidth() + ", " + this.getarea();
    }
    public boolean equals(Shapes s){
        return (this.length == s.length) && (this.width == s.width);
    }
}

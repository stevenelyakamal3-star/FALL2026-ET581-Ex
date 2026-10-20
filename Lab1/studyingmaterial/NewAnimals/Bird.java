

public class Bird {
    String name;
    Bird(String name){
        this.name = name;

    }   
    class Song{
        void Sing(){
            System.out.println(name + " is singing");

        }
    } 
    public static void main(String[] args){
        Bird b1 = new Bird("Robin");
        Bird.Song song = b1.new Song();
        song.Sing();
    }
}

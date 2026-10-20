

public class Animals {
    String name;
    double weight;
    Animals(String name, double weight){
        this.name=name;
        this.weight = weight;

    }   
    public static Animals[] filterAnimals(Animals[] animals){
        int count = 0;
        for(int i  =0; i <animals.length; i++){
            if (animals[i].weight>=100.0){
                
                count++;
            }

            
            
        }
        Animals[] result = new Animals[count];
        
        int index = 0;
        
        for(int i = 0; i<animals.length; i++){
            if (animals[i].weight >= 100.0){
                result[index] = animals[i];
                index++;
            }

        }
        return result;
    } 
    void displayinfo(){
        System.out.println(this.name + ", " + this.weight);
    }
    public static void main(String[] args){
        Animals[] animals = {
            new Animals("Elephant", 500.0),
            new Animals("Fox", 8.0),
            new Animals("Lion", 190.0),
            new Animals("Wolf", 75.0),
            new Animals("Rhinocerous", 100.0)

        };
        Animals[] result = Animals.filterAnimals(animals);
        for (int i = 0; i<result.length; i++){
            result[i].displayinfo();
        }

    }
}

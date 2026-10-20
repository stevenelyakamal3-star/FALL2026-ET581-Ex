

public class Car {
    String model;
    static String dealershipName = "Elite Motors";
    Car(String model){
        this.model = model;

    }
    static class DealershipInfo{
        void displayDealershipName(){
            System.out.println(dealershipName);
            
        }
    }
    public static void main(String[] args){
        Car.DealershipInfo info = new Car.DealershipInfo(); 
    }
}

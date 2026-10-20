

public class Product {
    String name;
    double price;
    Product(String name, double price){
        this.name = name;
        this.price = price;
    }   
    public static Product[] filterProducts(Product[] products){
        int count = 0;
        for (int i = 0; i <products.length; i++)
            if(products[i].price >=50.00){
                count++;
            }
            Product[] result = new Product[count];
    
            int index = 0;
            for(int i =0; i <products.length; i++){
                if (products[i].price>= 50.00){
                
                result[index] = products[i];
                index++;
                }

            }
            return result;


            
    
    }
    void displayinfo(){
        System.out.println(this.name + ", " + this.price);
    }
    public static void main(String[] args){
        Product[] products = {
            new Product("Keyboard", 45.00),
            new Product("Monitor", 180.00),
            new Product("Mouse", 25.00),
            new Product("Headphones", 50.00),
            new Product("Laptop", 750.00),
            new Product("USB drive", 12.00)
        };
        Product[] result = Product.filterProducts(products);
        for (int i = 0; i <result.length; i++){
            result[i].displayinfo();
        }

    }
}

public class Employee {
    private int id;
    private String name;
    private double salary;
    
    Employee(int i, String n, double s){
        this.id = i;
        this.name = n;
        this.salary = s;
    }
    public int getID(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void setID(int i){
        id = i;
    }
    public void setName(String n){
        name = n;
    }
    public void setSalary(double s){
        salary = s;
    }
    public String toString(){
        return "ID: " + this.id + ", " + "Name: " + this.name + ", " + "Salary: " + this.salary;
         
    }
}

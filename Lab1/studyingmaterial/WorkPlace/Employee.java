

public class Employee {
    String name;
    double salary;
    
    
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;

    }
    public static Employee[] filterEmployees(Employee[] employees){
        int count = 0;
        for (int i = 0; i <employees.length; i++){
            if (employees[i].salary>= 75000){
                count++;
            }
            
        }
        Employee[] result = new Employee[count];
        int index = 0;
        for (int i = 0; i <employees.length; i++){
            if (employees[i].salary>= 75000){
                result[index]= employees[i];
                index++;
            }   
        }
        return result;
    }
    void displayinfo(){
        System.out.println(this.name + ", " + this.salary);
    }

    public static void main(String[] args){
        Employee[] employees = {
            new Employee("Alex", 82000),
            new Employee("Jessica", 64000),
            new Employee("Brian", 95000),
            new Employee("Maria", 72000),
            new Employee("Daniel", 75000),
            new Employee("sophia", 58000)
        };
        Employee[] result = Employee.filterEmployees(employees);

        for (int i = 0; i<result.length; i++){
            result[i].displayinfo();
        }
    }



}

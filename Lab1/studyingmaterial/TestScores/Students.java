

public class Students {
    String name;
    int score;
    Students(String name, int score){
        this.name = name;
        this.score = score;

    }   
    public static Students[] filterStudents(Students[] students){
        int count = 0;
        for (int i = 0; i<students.length; i++){
            if (students[i].score>=80){
                count++;
            }

        }
        Students[] result = new Students[count];
        int index = 0;
        for (int i = 0; i <students.length; i++){
            
            if (students[i].score>= 80){
            
            result[index] = students[i];
            index++;
            }
        }
    return result;
    
    }
    void displayinfo(){
        System.out.println(this.name + ", " + this.score);
    }
    public static void main(String[] args){
        Students[] students = {
            new Students("David", 94),
            new Students("Sarah", 74),
            new Students("Michael", 85),
            new Students("Rachel", 68),
            new Students("Daniel", 80),
            new Students("Rebecca", 95)
        };
        Students[] result = Students.filterStudents(students);
        for (int i = 0; i<result.length; i++){
            result[i].displayinfo();

        } 
    }
}

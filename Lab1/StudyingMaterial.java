


public class StudyingMaterial{


    static final int MINUTES_IN_AN_HOUR = 60;
    static final int SECONDS_IN_A_MINUTE = 60;



    public static void converttime(int totalseconds){

        int secondsinanhour = MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE;
        int hours = totalseconds / secondsinanhour;
        totalseconds = totalseconds % secondsinanhour;
        int minutes = totalseconds / MINUTES_IN_AN_HOUR;
        int seconds = totalseconds % MINUTES_IN_AN_HOUR;
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);





    }
    public static void main(String[] args){
        converttime(7384);
        





    }











}



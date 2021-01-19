package tencodechallenges;
//Task 08


public class timeBreakdown {
    public static void convertToHoursMinutes(int user_number){

        int hours = user_number / 60;

        int minutes = user_number % 60;


        if (hours == 1 && (user_number%60 == 1) ){
            System.out.println(hours + " hour " +minutes+" minute.");
        }
        else if (hours !=1 && user_number%60==1){
            System.out.println(hours + " hours " +minutes+" minute.");
        }
        else if(hours !=1  && (user_number%60 !=1) ){
            System.out.println(hours + " hours " +minutes+" minutes.");
        }

        else if(hours==1 && (user_number%60 !=1)){
            System.out.println(hours + " hour " +minutes+" minutes.");
        }



    }
    public static void main(String[] args){
        convertToHoursMinutes(78);
    }
}

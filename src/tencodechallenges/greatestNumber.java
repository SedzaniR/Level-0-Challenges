package tencodechallenges;
//task 06
public class greatestNumber {

    public static void maximum(int... args)
    {

        int greatest;

        //indexing the first number for comparison purposes.
        greatest = args[0];
        for (int x = 1; x < args.length;x++){

            if(greatest<args[x]){
                greatest =  args[x];
            }
        }
        System.out.println(greatest +" is the greatest number.");

    }

    public static void main(String[] args){
        maximum(4,5,2,78,223,2,5);
    }


}


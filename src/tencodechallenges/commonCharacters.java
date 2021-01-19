package tencodechallenges;
//task 10
public class commonCharacters {
    public static void compare(String firstInput, String secondInput){

        //split method was used in order to use array indexing method
        String [] first_array = firstInput.split("");
        String [] second_array = secondInput.split("");


        System.out.print("Common Letters:");
        for (int x = 0; x < firstInput.length();x++ ){
            if(secondInput.contains(first_array[x])){
                System.out.print(first_array[x]+" ");
            }
        }

    }
    //code to call the compare function
    public static void main(String [] args)
    {
        compare("House","Computers");
    }
}


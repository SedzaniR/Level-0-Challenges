package tencodechallenges;
//task 04
public class mathematicalParity {
    public static void evenOrOdd(int userNumber)
    {
        if (userNumber % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    //I have taken the parity of zero as even
    // code to call the even_or_odd function to test it
    public static void main(String[] args){
        evenOrOdd(5);
    }

}

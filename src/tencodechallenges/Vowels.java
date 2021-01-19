package tencodechallenges;
//task 09
public class Vowels {
    public static void filterVowels(String user_word)
    {
        user_word = user_word.toLowerCase();
        char [] letter_array = user_word.toCharArray();

        System.out.println("These are the vowels in the string:");
        for (int x = 0; x < user_word.length(); x++)
        {
            if ( letter_array[x]=='a'|| letter_array[x]=='e' || letter_array[x]=='i' || letter_array[x]=='o' || letter_array[x]=='u'){
                System.out.print(letter_array[x] + "  ");
            }

        }




    }
    public static void main(String[] args){
        filterVowels("I never thought i would struggle with such a seemingly simple task");
    }

}

import java.util.Arrays;

public class Anagram{

    static boolean isAnagram( String string1, String string2){

        //remove whitespaces from strings
        string1 = string1.replaceAll("\\s+", "");
        string2 = string2.replaceAll("\\s+", "");

        //make strings lower case
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        //Get the length of the two strings
        int string1Length = string1.length();
        int string2Length = string2.length();

        if (string1Length != string2Length) {
            return false;
        }

        //transform the strings to char arrays
        char[] char1array = string1.toCharArray();
        char[] char2array = string2.toCharArray();

        //sort the two arrays
        Arrays.sort(char1array);
        Arrays.sort(char2array);

        for (int i = 0; i < char1array.length; i++){
            if (char1array[i] != char2array[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String inputString1 = "Desperation";
        String inputString2 = "A Rope Ends It";

        if (isAnagram(inputString1, inputString2)){
            System.out.println("Why yes, it is an anagram");
        }
        else{
            System.out.println("This is not the anagram you are looking for");
        }
    }
}

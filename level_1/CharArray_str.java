import java.lang.*;
import java.util.Scanner;

class CharArray_str {
    public char[] getCharacters(String str){
        char[] arr = new char[str.length()];
        for (int i = 0 ; i < str.length() ; i++){
            arr[i] = str.charAt(i);
        }
        return arr;
    }
    
    public boolean compareArrays(char[] char_1, char[] char_2) {

        if (char_1.length != char_2.length)
            return false;

        for (int i = 0; i < char_1.length; i++) {
            if (char_1[i] != char_2[i]) 
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = scanner.next();

        CharArray_str obj = new CharArray_str();
        char[] userArray = obj.getCharacters(str);
        char[] builtInArray = str.toCharArray();
        
        boolean result = obj.compareArrays(userArray, builtInArray);
        System.out.println("Are both character arrays same? " + result);
    }
}

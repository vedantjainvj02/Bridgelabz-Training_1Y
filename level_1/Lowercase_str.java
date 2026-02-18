import java.lang.*;
import java.util.*;

class Lowercase_str {
    public String getLowercaseStrings(String str){
        String lowerstr = "";

        for (int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
                ch =  (char)(ch + 32);

            lowerstr += ch;
        }
        return lowerstr;
    }

    public boolean compareString(String str_1 , String str_2){
        if (str_1.length() != str_2.length())
            return false;

        for (int i = 0 ; i < str_1.length() ; i++){
            if (str_1.charAt(i) != str_2.charAt(i))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = scanner.next();

        Lowercase_str obj = new Lowercase_str();

        String userString = obj.getLowercaseStrings(str);
        String builtinString = str.toLowerCase();

        boolean result = obj.compareString(userString,builtinString);
    }
}

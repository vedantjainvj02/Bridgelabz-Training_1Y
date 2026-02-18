import java.lang.*;
import java.util.*;

class Uppercase_str {
    public String getUppercaseStrings(String str){
        String upperstr = "";

        for (int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z')
                ch =  (char)(ch - 32);

            upperstr += ch;
        }
        return upperstr;
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

        Uppercase_str obj = new Uppercase_str();

        String userString = obj.getUppercaseStrings(str);
        String builtinString = str.toUpperCase();

        boolean result = obj.compareString(userString,builtinString);
    }
}

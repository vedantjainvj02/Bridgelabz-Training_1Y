import java.lang.*;
import java.util.*;

class Length_str {
    
    public int LengthStr(String str){
        int length = 0;
        char[] ch = str.toCharArray();

        for (char c : ch){
            length++;
        }

        return length;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = scanner.next();

        Length_str obj = new Length_str();
        int length = obj.LengthStr(str);
        System.out.println("The length of the String using User-Defined method : " + length);
        System.out.println("The length of the String using Built-in method : " + str.length());
    }
}

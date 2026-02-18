import java.lang.*;
import java.util.*;

class Split_str {
    
    public String[] SplitStr(String str){
        int count = 1 ;
        for (int i = 0 ; i < str.length() ; i++){
            if (str.charAt(i) == ' ')
                count++;
        }

        String[] words = new String[count];

        int index = 0;
        String temp = "";

        for (int i = 0 ; i < str.length() ; i++){
            if (str.charAt(i) != ' ' )
                temp += str.charAt(i);
            else{
                words[index] = temp;
                temp = "";
                index++;
            }
        }
        words[index] = temp;
        return words;
    }

    public boolean compareString(String[] str_1 , String[] str_2){
        if (str_1.length != str_2.length)
            return false;

        for (int i = 0 ; i < str_1.length ; i++){
            if (!str_1.equals(str_2))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = scanner.next();

        Split_str obj = new Split_str();
        String[] split_1 = obj.SplitStr(str);
        String[] split_2 = str.split(" ");

        boolean result = obj.compareString(split_1, split_2);

        System.out.println("Are both the same ? " + result);
    }
}

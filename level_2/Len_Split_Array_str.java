import java.lang.*;
import java.util.*;

class Len_Split_Array_str {

    public int LengthStr(String str){
        int length = 0;
        char[] ch = str.toCharArray();

        for (char c : ch){
            length++;
        }

        return length;
    }

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

    public String[][] str2D(String[] str ){
        String[][] result = new String[str.length][2];

        for (int i = 0; i < str.length; i++) {

            int len = LengthStr(str[i]);

            result[i][0] = str[i];
            result[i][1] = String.valueOf(len);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = scanner.next();

        Len_Split_Array_str obj = new Len_Split_Array_str();
        String[] words = obj.SplitStr(str);
        String[][] str2D = obj.str2D(words);

        for (int i = 0; i < str2D.length; i++) {
            int lengthValue = Integer.parseInt(str2D[i][1]);
            System.out.println(str2D[i][0] + "\t" + lengthValue);
        }
    }
}

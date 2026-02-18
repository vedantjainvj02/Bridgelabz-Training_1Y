import java.lang.*;
import java.util.*;

class Substring_str{

    public void  sub_charAt (String str , int index_1 , int index_2){
        String sub_1 = "";
        for (int i = index_1-1 ; i <= index_2 ; i++){
            sub_1 += str.charAt(i) ;
        }
        System.out.println("Substring using charAt() method : " + sub_1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the String : ");
        String str = scanner.next();
        System.out.print("Enter the first Index : ");
        int in_1 = scanner.nextInt();
        System.out.print("Enter the second Index : ");
        int in_2 = scanner.nextInt();

        Substring_str c1 = new Substring_str();
        c1.sub_charAt(str, in_1 , in_2 );
        String sub_2 = str.substring(in_1-1, in_2+1);
        System.out.println("Substring using charAt() method : " + sub_2);
        
    }
}
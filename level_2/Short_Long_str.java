import java.lang.*;
import java.util.*;

class Short_Long_str {

    public int LengthStr(String str){
        int length = 0;
        char[] ch = str.toCharArray();

        for (char c : ch){
            length++;
        }

        return length;
    }

    public String[] splitStr(String str) {

        int len = LengthStr(str);

        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ')
                wordCount++;
        }

        String[] words = new String[wordCount];

        int index = 0;
        String temp = "";

        for (int i = 0; i < len; i++) {

            if (str.charAt(i) != ' ') {
                temp += str.charAt(i);
            } else {
                words[index++] = temp;
                temp = "";
            }
        }

        words[index] = temp;
        return words;
    }

    public String[][] create2D(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int len = LengthStr(words[i]);
            data[i][0] = words[i];
            data[i][1] = String.valueOf(len);
        }

        return data;
    }

    public int[] findShortestLongest(String[][] data) {

        int min = Integer.parseInt(data[0][1]);
        int max = Integer.parseInt(data[0][1]);

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < data.length; i++) {

            int len = Integer.parseInt(data[i][1]);

            if (len < min) {
                min = len;
                minIndex = i;
            }

            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String text = scanner.nextLine();

        Short_Long_str obj = new Short_Long_str();
        String[] words = obj.splitStr(text);
        String[][] table = obj.create2D(words);
        int[] result = obj.findShortestLongest(table);

        System.out.println("\nShortest Word: " + table[result[0]][0]);
        System.out.println("Longest Word: " + table[result[1]][0]);

    }
}

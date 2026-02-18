import java.util.*;

class Vowel_Consonant_str {

    public String checkChar(char ch) {

        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }

    // Method 2: Create 2D array of character and type
    public String[][] createTable(String str) {

        String[][] table = new String[str.length()][2];

        for (int i = 0; i < str.length(); i++) {

            table[i][0] = String.valueOf(str.charAt(i));
            table[i][1] = checkChar(str.charAt(i));
        }

        return table;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String text = scanner.nextLine();

        Vowel_Consonant_str obj = new Vowel_Consonant_str();
        String[][] table = obj.createTable(text);

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }

    }
}

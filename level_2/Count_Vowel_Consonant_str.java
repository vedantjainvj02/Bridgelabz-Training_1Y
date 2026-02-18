import java.util.*;

class Count_Vowel_Consonant_str {

    public String checkChar(char ch) {

        if (ch >= 'a' && ch <= 'z') {

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        }

        return "Not a Letter";
    }

    public int[] countVC(String str) {

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < str.length(); i++) {

            String result = checkChar(str.charAt(i));

            if (result.equals("Vowel"))
                vowels++;
            else if (result.equals("Consonant"))
                consonants++;
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String text = scanner.nextLine();

        Count_Vowel_Consonant_str obj = new Count_Vowel_Consonant_str();
        int[] result = obj.countVC(text);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}

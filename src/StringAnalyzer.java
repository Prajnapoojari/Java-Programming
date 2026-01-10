import java.util.Scanner;

class StringAnalyzer {

    static void analyzeString(String str) {
        int vowels = 0, consonants = 0, words = 1; // words start from 1

        str = str.toLowerCase(); // convert to lowercase for simplicity

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            } else if (ch == ' ') {
                words++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Words: " + words);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        analyzeString(sentence);

        sc.close();
    }
}


import java.util.Scanner;

public class StringProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Enter a number: ");
        int words = 0, vowels = 0;
        boolean inWord = false;

        StringBuilder title = new StringBuilder();
        boolean newWord = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ("AEIOUaeiou".indexOf(ch) != -1)
                vowels++;

            if (ch != ' ') {
                if (!inWord) {
                    words++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }

            if (ch == ' ') {
                title.append(ch);
                newWord = true;
            } else {
                if (newWord) {
                    title.append(Character.toUpperCase(ch));
                    newWord = false;
                } else {
                    title.append(Character.toLowerCase(ch));
                }
            }
        }

        System.out.println("Words: " + words);
        System.out.println("Vowels: " + vowels);
        System.out.println("Title Case: " + title);
    }
}
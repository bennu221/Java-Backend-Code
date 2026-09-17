import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String clean = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ')
                clean += Character.toLowerCase(ch);
        }

        String rev = "";
        for (int i = clean.length() - 1; i >= 0; i--) {
            rev += clean.charAt(i);
        }

        if (clean.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
import java.util.Scanner;

public class Regex {
    public static void verifyPasswordComplexity() {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        System.out.println("Input string was " + inputString);

        boolean minimumLength = false;
        boolean oneDigit = false;
        boolean oneUpperCaseLetter = false;
        boolean oneLowerCaseLetter = false;
        boolean oneSpecialCharacter = false;

        if (inputString.length() >= 8) { minimumLength = true; }
        if (inputString.matches(".*\\d.*")) { oneDigit = true; }
        if (inputString.matches(".*[A-Z].*")) { oneUpperCaseLetter = true; }
        if (inputString.matches(".*[a-z].*")) { oneLowerCaseLetter = true; }
        if (inputString.matches(".*\\W.*")) { oneSpecialCharacter = true; }

        System.out.println("minimumLength " + minimumLength);
        System.out.println("oneDigit " + oneDigit);
        System.out.println("oneUpperCaseLetter " + oneUpperCaseLetter);
        System.out.println("oneLowerCaseLetter " + oneLowerCaseLetter);
        System.out.println("oneSpecialCharacter " + oneSpecialCharacter);
    }
}

import java.util.Scanner;

public class HumanReadable {
    public static void verifyPasswordComplexity() {
        Scanner in = new Scanner(System.in);
        System.out.println("Avoid using full stop and backward slash");
        String inputString = in.nextLine();
        System.out.println("Input string was " + inputString);

        boolean minimumLength = false;
        boolean oneDigit = false;
        boolean oneUpperCaseLetter = false;
        boolean oneLowerCaseLetter = false;
        boolean oneSpecialCharacter = false;

        if (inputString.length() >= 8) { minimumLength = true; }
        if (inputString.chars().anyMatch(Character::isDigit)) { oneDigit = true; }
        if (inputString.chars().anyMatch(Character::isUpperCase)) { oneUpperCaseLetter = true; }
        if (inputString.chars().anyMatch(Character::isLowerCase)) { oneLowerCaseLetter = true; }

        //anyMatch special character work done manually
        char[] specialCharacter = {'!', '"', '#', '$', '%', '&', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', ']', '^', '_', '`', '{', '|', '}', '~', }; // To investigate '\'
        for (int i = 0; i < (inputString.length() - 1); i++) {
            if (oneSpecialCharacter) { break; }
            for (int j = 0; j < (specialCharacter.length - 1); j++) {
                if (inputString.charAt(i) == specialCharacter[j]) {
                    oneSpecialCharacter = true;
                    break;
                }
            }
        }

        System.out.println("minimumLength " + minimumLength);
        System.out.println("oneDigit " + oneDigit);
        System.out.println("oneUpperCaseLetter " + oneUpperCaseLetter);
        System.out.println("oneLowerCaseLetter " + oneLowerCaseLetter);
        System.out.println("oneSpecialCharacter " + oneSpecialCharacter);
    }
}

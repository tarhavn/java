import java.util.Scanner;

public class BestCaseScenario {
    public static void isEvenWithExtractedNumbers() {
        System.out.println("Input will be sanitised. Please enter a number:");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        StringBuilder numericValues = new StringBuilder();

        for (char c : inputString.toCharArray()) {
            if (Character.isDigit(c)) { numericValues.append(c); }
        }

        try {
            int sanitizedInt = Integer.parseInt(String.valueOf(numericValues));
            int remainder = sanitizedInt % 2;
            if (remainder==0) {
                System.out.println("Given number is even");
            } else {
                System.out.println("Given number is odd");
            }
        } catch (NumberFormatException e) {
            System.out.println("Input not a number");
        }
    }
}

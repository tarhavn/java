import java.util.Scanner;

    public class AverageCaseScenario {
        private static boolean isEven() {
            System.out.println("Please enter an integer value number:");
            Scanner in = new Scanner(System.in);
            String inputString = in.nextLine();
            int inputInt = Integer.parseInt(inputString);
            int remainder = inputInt % 2;
            return remainder == 0;
        }

        public static void isEvenHuman() {
            if (isEven()) {
                System.out.println("Number is even!");
            } else {
                System.out.println("Number is odd!");
            }
        }
    }

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a new password which contains at least");
        System.out.println("8 characters" + "One upper and lowercase letter" + "A number" + "A special character");

        Regex.verifyPasswordComplexity();
        //HumanReadable.verifyPasswordComplexity();
    }
}
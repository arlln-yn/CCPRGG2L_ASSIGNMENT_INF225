import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        drive("driving");
        scan.close();
    }

    static void drive(String driving) {

        System.out.println("Driving!");
        practice(driving);

        String feedback = getFeedBack(driving);

        // Define the base case / stopping condition
        if (feedback.equals("no")) {

            // Do something to reach the goal
            tryAgain(driving);

            // Recursive call
            drive(driving);
        } else if (feedback.equals("yes")) {
            youPassed(driving);
        }
    }

    static void practice(String driving) {
        System.out.println("You are now practicing how to drive!");
    }

    static String getFeedBack(String driving) {
        System.out.println("Did you pass the " + driving + " test? (Enter \"yes\" or \"no\")");

        String feedback = scan.next();

        return feedback;
    }

    static void tryAgain(String driving) {
        System.out.print("Enter additional tries of driving:");
        String tries = scan.next();
        System.out.println("Practicing how to drive. Added " + tries + " tries");
    }

    static void youPassed(String driving) {
        System.out.println("Congratulations!");
    }

}
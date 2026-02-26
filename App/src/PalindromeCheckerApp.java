import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Variable to store reversed string
        String reversed = "";

        // Iterate from the last character to the first
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Compare original and reversed string
        if (input.equals(reversed)) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }

        scanner.close();
    }
}

/* git config user.name
git config user.name "MokshdaAgarwal"
git config user.email
git config user.email
git checkout -b UC1
git status
    copy the red file
git add 'the file'
git status

git commit -m "UC1: Application Entry & Welcome Message
Goal: Display a welcome message and app details at startup.
Actor: User
Flow:
Program starts.
JVM invokes the main() method.
Application name is displayed.
Application version is displayed.
Program continues to next use case or exits.
Key Concepts used in UC1:
Class – Acts as a container for the Palindrome Checker application logic.
Main Method – Entry point of the Java application with the signature
 public static void main(String[] args).
Static Keyword – Allows the JVM to invoke the main() method without creating an object.
Console Output – System.out.println() is used to display messages on the console.
Application Flow Control – Defines the startup behavior before palindrome processing begins."

git push origin UC1

 */






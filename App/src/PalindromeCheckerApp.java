
import java.util.Stack;

public class UseCase5PalindromeCheckerApp
{


    public static void main(String[] args)
    {


        String input = "noon";

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray())
        {
            stack.push(c);
        }

        boolean isPalindrome = true;

        for (char c : input.toCharArray())
        {

            char popped = stack.pop();

            if (c != popped) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}


/* git config user.name
git config user.name "MokshdaAgarwal"
git config user.email
git config user.email ''
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

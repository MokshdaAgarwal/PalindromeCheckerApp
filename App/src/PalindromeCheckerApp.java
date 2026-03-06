import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();

        PalindromeStrategy strategy = new StackStrategy();
        boolean result = strategy.check(input);

        System.out.println("Is Palindrome: " + result);
    }
}

interface PalindromeStrategy {
    boolean check(String input);
}

class StackStrategy implements PalindromeStrategy {

    public boolean check(String input) {
        long startTime = System.nanoTime();

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
                isPalindrome = false;
                break;
            }
        }

        return true;
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("Is Palindrome: " + isPalindrome);
        System.out.println("Execution Time: " + executionTime + " ns");
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

git commit -m "UC1: Application Entry & "

git push origin UC1

git check out main
git pull origin main
*/

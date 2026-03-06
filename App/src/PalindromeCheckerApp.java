import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    @@ -8,26 +9,31 @@ public static void main(String[] args) {
        System.out.print("Input: ");
        String input = sc.nextLine();

        PalindromeService service = new PalindromeService();
        boolean result = service.checkPalindrome(input);
        PalindromeStrategy strategy = new StackStrategy();
        boolean result = strategy.check(input);

        System.out.println("Is Palindrome: " + result);
    }
}

class PalindromeService {
    interface PalindromeStrategy {
        boolean check(String input);
    }

    class StackStrategy implements PalindromeStrategy {

        public boolean checkPalindrome(String input) {
            public boolean check (String input){

                int start = 0;
                int end = input.length() - 1;
                Stack<Character> stack = new Stack<>();

                for (char c : input.toCharArray()) {
                    stack.push(c);
                }

                while (start < end) {
                    if (input.charAt(start) != input.charAt(end)) {
                        for (char c : input.toCharArray()) {
                            if (c != stack.pop()) {
                                return false;
                            }
                            start++;
                            end--;
                        }

                        return true;
                    }
                }
            }
        }
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

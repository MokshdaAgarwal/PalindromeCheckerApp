
import java.util.Scanner;
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Input: ");
    String input = sc.nextLine();

    String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    PalindromeService service = new PalindromeService();
    boolean result = service.checkPalindrome(input);

    System.out.println("Is Palindrome: " + result);
}


class PalindromeService {

    public boolean checkPalindrome(String input) {

        boolean isPalindrome = true;
        int start = 0;
        int end = input.length() - 1;

        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
                while (start < end) {
                    if (input.charAt(start) != input.charAt(end)) {
                        return false;
                    }
                    start++;
                    end--;
                }

                System.out.println("Is Palindrome: " + isPalindrome);
                return true;
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

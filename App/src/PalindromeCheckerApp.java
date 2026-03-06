
import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "radar";
        Scanner sc = new Scanner(System.in);

        char[] chars = input.toCharArray();
        System.out.print("Input: ");
        String input = sc.nextLine();

        int start = 0;
        int end = chars.length - 1;
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                for (int i = 0; i < normalized.length() / 2; i++) {
                    if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                        isPalindrome = false;
                        break;
                    }
                    start++;
                    end--;
                }

                System.out.println("Input : " + input);
                System.out.println("Is Palindrome? : " + isPalindrome);
                System.out.println("Is Palindrome: " + isPalindrome);
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

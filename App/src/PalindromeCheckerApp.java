import java.util.LinkedList;


public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";


        LinkedList<Character> list = new LinkedList<>();


        for (char c : input.toCharArray()) {
            list.add(c);
        }


        boolean isPalindrome = true;

        while (list.size() > 1) {
            if (list.removeFirst() != list.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

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

git commit -m "UC1: Application Entry & "

git push origin UC1

git check out main
git pull origin main
*/

import java.util.Scanner;

public class palindromstrig {
    public static String isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return "Not a palindrome";
            left++;
            right--;
        }
        return "Palindrome";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println(isPalindrome(s));
    }
}

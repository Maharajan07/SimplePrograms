
import java.util.Scanner;

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int n = x;
        int sum = 0;

        while (n != 0) {
            int r = n % 10;
            sum = (sum * 10) + r;
            n = n/10;
        }

        return sum == x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to Check: ");
        int n = sc.nextInt();
        PalindromeNumber obj = new PalindromeNumber();
        System.out.println(obj.isPalindrome(n));
    }
}

import java.util.Scanner;

public class reverseNum {

    static int rev(int n) {
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum = (sum * 10) + r;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();
        int result = rev(num);
        System.out.println("Reversed number: " + result);
    }
}

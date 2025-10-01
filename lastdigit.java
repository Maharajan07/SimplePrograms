import java.util.*;

public class lastdigit{

    static int lastDigit(int base, int power) {
        int num = (int) Math.pow(base, power);
        int res = num % 10;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number for Base: ");
        int base = sc.nextInt();
        System.out.print("Enter a number for Power: ");
        int power = sc.nextInt();
        
        System.out.println("The last digit of given number is: " + lastDigit(base, power));
        sc.close();

    }
}
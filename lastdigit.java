import java.util.*;

public class lastdigit{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number for Base: ");
        int base = sc.nextInt();
        System.out.print("Enter a number for Power: ");
        int power = sc.nextInt();
        double num = Math.pow(base, power);
        int result = (int) (num%10);
        System.out.println("The last digit of given number is: " +result);
        sc.close();

    }
}
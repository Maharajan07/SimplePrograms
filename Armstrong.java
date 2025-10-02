import java.util.Scanner;

class Armstrong {
    static boolean armstrongNumber(int n) {
        int digit = 0;
        int num = n;
        int original  = n;
        
        while (num != 0) {
            num = num/10;
            digit++;
        }
    
        int sum = 0;
        
        while (n != 0) {
            int r = n % 10;
            sum = sum + (int) Math.pow(r, digit);
            n = n/10;
        }
        
        return sum == original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number to check: ");
        int n = sc.nextInt();

        System.out.println(armstrongNumber(n));
    }
}
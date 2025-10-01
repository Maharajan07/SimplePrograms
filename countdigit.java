import java.util.*;

public class countdigit {

    static int countDigit(int num) {
        int n = num;
        int count = 0;
        while (n != 0) {
            int digit = n % 10;     // gets last digit
            if (digit != 0 && num % digit == 0) {
                count++;
            }
            n = n/10;       // removes last digit
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        // int count = 0;

        /* // method -1
        String numStr = Integer.toString(num);      // converts integer to string
        for (int i=0; i<numStr.length(); i++){
            int digit = numStr.charAt(i) - '0';     // gets actual value
            if( digit != 0 && num%digit == 0){
                count++;
            }
        } 
        System.out.println("The count of the digit that divides the given number eventually is: " + count);
        */

        System.out.println("The count of the digit that divides the given number eventually is: " + countDigit(num));
        sc.close();

    }
}

import java.util.*;

public class countdigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int count = 0;
        String numStr = Integer.toString(num);
        for (int i=numStr.length()-1; i>=0; i--){
            int digit = numStr.charAt(i) - '0';
            if( digit != 0 && num%digit == 0){
                count++;
            }
        }

        System.out.println("The count of the digit that divides the given number eventually is: "+count);
        sc.close();

    }
}

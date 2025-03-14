import java.util.*;

public class prime{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int p = sc.nextInt();
        if ( p % 2 != 0 && p % 3 != 0 && p % 5 != 0 && p % 7 != 0 ){
            System.out.println("Prime");
        }
        else if ( p == 2 || p == 3 || p == 5 || p ==7 ){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not");
        }
        sc.close();

    }
}
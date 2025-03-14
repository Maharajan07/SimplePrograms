import java.util.*;
public class prime2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int p = sc.nextInt();

        if (p <= 1){
            System.out.println("It's a Prime");
        }

        boolean isPrime = true;
        for (int i=2; i*i<=p; i++){
            if (p%i == 0){
            isPrime = false;
            break;
            }
        }

        if(isPrime){
            System.out.println("It's a Prime");
        }
        else{
            System.out.println("It's not a Prime");
        }
        sc.close();

    }
}

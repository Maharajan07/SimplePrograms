import java.util.*;
public class palindrome2 {
public static void main(String[] args) {
    System.out.println("Enter a String: ");
    Scanner sc = new Scanner(System.in);
    String a = sc.nextLine();

    int n = a.length()-1;
    boolean isPalindrome = true;

    for(int i=0; i<=n/2; i++){
        if(a.charAt(i) != a.charAt(n-i)){
            isPalindrome = false;
            break;
        }
    }
    if(isPalindrome){
    System.out.println("It's a Palindrome");
    }

    else{
    System.out.println("It's Not a Palindrome");
    }
    sc.close();

}
}

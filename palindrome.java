import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        Scanner sc= new Scanner(System.in);
        String a = sc.nextLine();
        String b = "";
        for(int i=a.length()-1; i>=0; i--){
            b=b+a.charAt(i);
        }
        if(a.equals(b)){
            System.out.println("It's a palindrome");
        }
        else{
            System.out.println("It's not a Palindrome");
        }
        sc.close();
  
    }

}

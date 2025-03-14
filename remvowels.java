import java.util.*;

public class remvowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String a = sc.nextLine();
        char[] b = a.toCharArray();
        char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        String result = "";

        for(int i =0;i<=b.length-1;i++){
            boolean isVowel = false;
            for(int j=0; j<=vowels.length-1; j++){
                if(b[i] == vowels[j]){
                    isVowel = true;
                    break;
                }
            }
            if(isVowel==false){
                result += b[i];
            }
        }
        System.out.println("The string after removes vowels: " +result);
        sc.close();

    }

}

import java.util.Scanner;

public class ArraysProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter " + n + " values: ");
        for (int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array: ");
        for (int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int temp = 0;
        sc.nextLine();
        System.out.println("Choose: asec/dsec");
        String s = sc.nextLine();
        if (s.equals("asec")) {
            System.out.print("Array in asec: ");
            for (int i=0; i<n; i++) {
                for (int j=i+1; j<n; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        else if (s.equals("dsec")) {
            System.out.print("Array in dsec: ");
            for (int i=0; i<n; i++) {
                for (int j=i+1; j<n; j++) {
                    if (arr[j] > arr[i]) {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                    }
                }
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        else {
            System.out.println("Invalid input..");
        }

        System.out.println("Choose: max/min");
        String m = sc.nextLine();
        if (m.equals("max")) {
            int max = arr[0];
            for (int i=1; i<n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println("Max: " + max);
        }
        else if(m.equals("min")) {
            int min = arr[0];
            for (int i=1; i<n; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println("Min: " + min);
        }
        else {
            System.out.println("Invaid input..");
        }
        System.out.println("Thankyou!");
        
    }
}
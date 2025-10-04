/* Problem statement
Given an integer 'N', your task is to write a program that returns all the divisors of 'N' in ascending order.

Sample Input 1 :
10
Sample Output 1 :
1 2 5 10
Explanation of Sample Input 1:
The divisors of 10 are 1,2,5,10. */


import java.util.*;

class PrintAllDivisors {
    public static void print_divisors(int n) {
        List<Integer> small = new ArrayList<>();
        List<Integer> large = new ArrayList<>();
        
        for (int i=1; i*i<=n; i++) {
            if (n%i == 0) {
                small.add(i);
                if (i != n/i) {
                    large.add(n/i);
                }
            }
        }
        
        for (int x:small) {
            System.out.print(x + " ");
        }
        for (int i=large.size()-1; i>=0; i--) {
            System.out.print(large.get(i) + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        print_divisors(n);
    }
}

// Time Complexity: O(√n)
// Space Complexity: O(√n)
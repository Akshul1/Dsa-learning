package b_Recursion_Backtracking;
//Check if the string is palindrome or not

import java.util.Scanner;

public class e_
{
    public static boolean palindrome(String s,int i, int n){
// Recursive function to check if a string is a palindrome

            // Base case: If we've checked all characters
            if (i >= n / 2) {
                return true;
            }

            // If characters don't match, not a palindrome
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }

            // Recursive call
            return palindrome(s, i + 1, n);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check: ");
        String str = scanner.nextLine();

        boolean result = palindrome(str, 0, str.length());

        if (result) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's NOT a palindrome.");
        }

        scanner.close();
    }
}

package b_Recursion_Backtracking;

import java.util.Scanner;

//Multiple recursion calls
//Fibonacci series ----> till n
public class f_
{
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;  // Base cases: F(0) = 0, F(1) = 1
        }

        // Using two variables to store F(n-1) and F(n-2)
        int last = fibonacci(n - 1);   // F(n-1))
        int slast = fibonacci(n - 2);  // F(n-2)

        // Return the sum of the two values
                return last + slast;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to print fibonacci series till that");
        int n = sc.nextInt();
        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }
}

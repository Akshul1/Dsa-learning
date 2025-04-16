package b_Recursion_Backtracking;

import java.util.Scanner;

public class c_
{
    public void rec1(int n,int sum){
//        Sum if first n numbers
//       PARAMETRIZED WAY  definition?

        if (n<1){
            System.out.println("sum = "+sum);
            return;
        }
        rec1(n-1,sum+n);
    }
    public int rec2(int n){
//        Sum of first n numbers
//        FUNCTIONAL WAY
        if(n==0){
            return 0;
        }
        return n + rec2(n-1);
    }

    public int  rec3(int n) {
//       Factorial of n using recursion
        if (n==0){
            return 1;
        }
        return n* rec3(n-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        c_ c= new c_();
        int factorial =c.rec3(n);
        System.out.println(factorial);
//         int sum= c.rec2(n);
//        System.out.println(sum);
    }
}

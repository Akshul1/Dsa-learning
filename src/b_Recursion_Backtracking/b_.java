package b_Recursion_Backtracking;
//        QUESTION 4 AND 5 IS NOT DONE

import java.util.Scanner;

public class b_
{
    public void re1(int n){
//        Print names n times using recursion
        if(n==0){
            return;
        }
        System.out.println("Akshul");
        re1(n-1);
    }
    public void re2(int i, int n ){
//        Print linearly 1 to n;
        if(i>n){
            return;
        }
        System.out.println(i);
        re2(i+1,n);
    }
    public void re3(int n){
//        print from n to 1;
        if(n==0){
            return;
        }
        System.out.println(n);
        re3(n-1);
    }
    public void re4(int i){
//        print from 1 to n (Backtracking)
        if (i<1){
            return;

        }
        re4(i-1);
        System.out.println(i);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        b_ b= new b_();
        b.re3(n);

    }
}

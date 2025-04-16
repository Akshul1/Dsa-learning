package a_Pattern_Maths;

import java.util.Scanner;

public class b_Maths
{

    public int maths (int n){
        // revers a numver
        int reverseno= 0;
        while (n!=0) {
            int lastdigit = n%10;
            if(reverseno>Integer.MAX_VALUE/10 || reverseno<Integer.MIN_VALUE/10){
                return 0;
            } // know the work of this
            reverseno=(reverseno*10)+lastdigit;
            n = n / 10;
        }
        return reverseno;
    }
    public void checkPlandrome (int n){
        // palindrome number
        int reverseno= 0;
        int dup =n;
        while (n!=0) {
            int lastdigit = n%10;
            if(reverseno>Integer.MAX_VALUE/10 || reverseno<Integer.MIN_VALUE/10){
            }
            reverseno=(reverseno*10)+lastdigit;
            n = n / 10;
        }
        if(reverseno==dup){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int n=sc.nextInt();
        b_Maths bm= new b_Maths();
        bm.checkPlandrome(n);




        sc.close();
    }
}

package a_Pattern_Maths;

import java.util.Scanner;

public class a_Pattern
{

    public void pat1(int n){

        for (int i=0;i<n;i++){
            for (int j = 0; j <n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pat2(int n){

        for (int i=0;i<n;i++){
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pat3(int n){

        for (int i=1;i<=n;i++){
            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public void pat4(int n){

        for (int i=1;i<=n;i++){
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public void pat5(int n){

        for (int i=1;i<=n;i++){
            for (int j = 0; j <n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pat6(int n){

        for (int i=1;i<=n;i++){
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public void pat7(int n){
        for (int i = 0; i < n; i++) {
            //  space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }

            // star
            for(int j=0;j<2*i+1;j++)
            {
                System.out.print("*");
            }
            // space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    public void pat8(int n){
        for (int i = 0; i < n; i++) {
            // space
            for(int j=0; j<i;j++){
                System.out.print(" ");
            }
            // star
            for(int j=0;j<2*n-(2*i+1);j++)
            {
                System.out.print("*");
            }
            // space
            for(int j=0; j<i;j++){
                System.out.print(" ");
            }
            System.out.println();

        }
    }
    public void pat10(int n){
        for(int i=1;i<=2*n-1;i++)
        {
            int star= i;
            if(i>n){
                star=2*n-i;
            }
            for(int j=1;j<=star;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public void pat11(int n){
        int start =1;
        for(int i=0;i<n;i++)
        {
            if(i%2==0){
                start=1;
            }else{
                start=0;
            }
            for(int j=0;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
    public void pat12(int n)
    {
        int space= 2*(n-1);
        for(int i=1;i<=n;i++)
        {
            // numbers
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            // space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            // numbers
            for(int j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
            space-=2;
        }

    }
    public void pat13(int n){
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num=num+1;
            }
            System.out.println();
        }
    }
    public void pat14(int n){
        for(int i =0;i<n;i++){
            for(char ch='A';ch<= 'A'+i;ch++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public void pat15(int n){
        for(int i =0;i<n;i++)
        {
            for(char ch= 'A'; ch<= 'A'+ (n-i-1);ch++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public void pat16(int n){
        for(int i =0; i<n;i++)
        {
            char ch=(char) ('A' + i);
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch+" ");

            }
            System.out.println();
        }
    }
    public void pat17(int n){
        for (int i = 0; i < n; i++) {
            //  space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }

            // alphabet
            char ch= 'A';
            int breakpoint =(2*i+1)/2;
            for(int j=1;j<=2*i+1;j++)
            {
                System.out.print(ch);
                if(j<=breakpoint){
                    ch++;
                }else{
                    ch--;
                }
            }

            // space
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    public void pat18(int n){
        for(int i =0;i<n;i++)
        {
            for(char ch=(char) ('E'-i);ch<='E';ch++)
            {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public void pat19(int n){
        int insps= 0;
        for(int i=0;i<n;i++)
        {
            // stars
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            // spaces
            for(int j=1;j<=insps;j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            insps+=2;
            System.out.println();
        }

        insps=2*n-2;
        for(int i=1;i<=n;i++)
        {
            // stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            // spaces
            for(int j=1;j<=insps;j++){
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            insps-=2;
            System.out.println();
        }
    }
    public void pat20(int n){
        int space = 2*n-2;
        for(int i=1;i<=2*n-1;i++)
        {
            int star= i;
            if(i>n){
                star=2*n-i;
            }
            // stars
            for(int j=1;j<=star;j++)
            {
                System.out.print("*");
            }
            // spaces
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            // stars
            for(int j=1;j<=star;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            if (i<n) {
                space-=2;
            }else{
                space+=2;
            }
        }
    }
    public void pat21(int n){
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || j==0 || i==n-1 || j==n-1)
                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public void pat22(int n){
        for(int i=0;i<2*n-1;i++)
        {
            for(int j=0;j<2*n-1;j++)
            {
                int top = i;
                int left= j;
                int right =(2*n-2)-j;
                int bottom= (2*n-2)-i;
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(right, left)));            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n= sc.nextInt();

            a_Pattern p1 = new a_Pattern();
            p1.pat22(n);
        }

        sc.close();

    }
}

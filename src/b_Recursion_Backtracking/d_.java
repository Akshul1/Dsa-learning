package b_Recursion_Backtracking;

import java.util.Scanner;
//This is a two pointer code other code is written in the notes...
// Reverse and array code
public class d_
{
    public static void reverse(int[] arr, int start, int end){
        if(start>=end){
            return;
        }

//        swap
        int temp= arr[start];
        arr[start]= arr[end];
        arr[end]= temp;

//        Recursive call
        reverse(arr, start+1, end-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int []arr = new int[n];

//        Take the array element input;
        System.out.println("Enter "+ n+" elements");
        for (int i= 0;i<n;i++){
            arr[i]= sc.nextInt();
        }

        reverse(arr,0,n-1);

//        Print the reversed array
        System.out.println("Reversed array");
        for (int num:arr){
            System.out.print(num+" ");
        }

        sc.close();
    }
}

package c_Hashing;

import java.util.Scanner;

public class a
{
    public static void main(String[] args) {
//        input the elements in the array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i =0; i<n;i++){
            arr[i]= sc.nextInt();
        }

//        Precompute
//        This creates an array named hash with 13 elements: hash[0] to hash[12].
//
//Initially, all elements in the hash array are zero by default.
//
//This array will be used to store the frequency of numbers between 0 and 12.
//
//Example: If the number 5 appears three times in the input, then hash[5] == 3.
        int[] hash = new int[13];
        for(int i =0;i<n;i++){
//            This line is counting how many times a number appears in the array.
            hash[arr[i]]+=1;
        }

        System.out.println("enter the number you want to see the frequency");
        int q= sc.nextInt();
        while(q>0){
            int number= sc.nextInt();
//            fetch
            System.out.println(hash[number]);
            q--;
        }
    }
}

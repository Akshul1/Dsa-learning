package c_Hashing;

import java.util.Scanner;

public class a
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i =0; i<n;i++){
            arr[i]= sc.nextInt();
        }

//        Precompute
        int[] hash = new int[13];
        for(int i =0;i<n;i++){
            hash[arr[i]]+=1;
        }

        int q= sc.nextInt();
        while(q>0){
            int number= sc.nextInt();
//            fetch
            System.out.println(hash[number]);
        }
    }
}

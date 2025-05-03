package c_Hashing;

import java.util.Scanner;

//practice a problem in we count the no. of times  element cones in the array
public class e
{
    public static void main(String[] args) {
//        take the input of the array
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }


//        precompile
        int []harsh= new int[10];
        for(int i=0;i<n;i++){
//            here we count the frequency
            harsh[arr[i]]+=1;

        }

        int q=sc.nextInt();
        while(q>0){
            int num= sc.nextInt();
//            fetch
            System.out.println(harsh[num]);
            q--;
        }


    }
}

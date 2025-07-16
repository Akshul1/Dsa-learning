package e_Array;

import java.util.ArrayList;
import java.util.Collections;

//Rearrange Array Elements by Sign
public class bm6
{
    public static int[] brute(int[]A, int n){

        ArrayList<Integer>pos=new ArrayList<>();
        ArrayList<Integer>neg=new ArrayList<>();

        for(int i=0; i<n;i++){
            if(A[i]>0){
                pos.add(A[i]);
            }else{
                neg.add(A[i]);
            }
        }
        for(int i=0;i<n/2;i++){
            A[2*i]=pos.get(i);
            A[2*i+1]=neg.get(i);
        }
        return A;
    }
    public static int[] optimal(int[]A, int n){
//        Create a answer array filled with zeros
        int []ans= new int[n];

        int posIndex=0,negIndex=1;

        for(int i=0;i<n;i++){
            if(A[i] < 0 && negIndex < n){
                ans[negIndex]=A[i];
                negIndex+=2;

            }else if(A[i] > 0 && posIndex < n) {
                ans[posIndex]=A[i];
                posIndex+=2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // Array Initialisation.
        int n = 4;
        int A[]= {1,2,-4,-5};


        int[]ans= optimal(A,n);

        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}

package e_Array;

import java.util.ArrayList;

//move zero to the end
public class ae6
{
//    Using brute force approach-> takes the temporary array
    public static int[] brute(int[]arr,int n){
//        temporary array
        ArrayList<Integer> temp= new ArrayList<>();
//        moving non zero elements in the temp.
        for (int i=0;i<n;i++){
            if(arr[i]!=0){
                temp.add(arr[i]);
            }
        }
//        no. of non zero elements
        int nz= temp.size();
//        copy elements from temp to fill the first nz size of the original array
        for (int i=0;i<nz;i++){
            arr[i]= temp.get(i);
        }
//        fill rest of space with zero
        for(int i=nz;i<n;i++){
            arr[i]=0;
        }
        return arr;
    }
//    Time Complexity-> O(2n)== O(n)
//    Space Complexity ->O(N)  because used temp array.


//    OPTIMAL WAY
//    Leetcode->   
//    Approach using 2 pointer= j points the zero and the i is j+1 and then spaw
//    time complexity ->O(n).
//    space complexity->O(1).
    public static void main(String[] args)
    {
       int[]arr={1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
       int n= arr.length;
       int []ans= brute(arr,n);
       for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
       }
        System.out.println(" ");
    }
}
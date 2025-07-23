package e_Array.easy;
//Find the union and intersection of two sorted arrays

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ae8
{
    public static int bruteUnion(int[] arr, int[] arr1){
        int n= arr.length;
        int n1 = arr1.length;

        Set<Integer> st = new HashSet<>();
        for(int i=0;i<n;i++){
            st.add(arr[i]);
        }
        for(int i=0;i<n1;i++){
            st.add(arr1[i]);
        }
//        this only gives size eg- 6;
//        return st.size();


        System.out.println("Union elements");
        for(int num: st){
            System.out.print(num+" ");
        }
        System.out.println();
        System.out.print(" Size of the element->    ");
        return st.size();

    }
    static ArrayList<Integer> optimalUnion(int[] arr, int[] arr1){
        int n= arr.length;
        int m= arr1.length;
        int i=0,j=0; // pointers

        ArrayList<Integer> union= new ArrayList<>();

        while (i<n && j<m){
            if(arr[i]<= arr1[j]){     //case 1 and 2;
                if(union.size()==0||union.get(union.size()-1)!=arr[i])
                    union.add(arr[i]);
                i++;
            }else{
                if(union.size()==0|| union.get(union.size()-1)!=arr1[j])
                    union.add(arr1[j]);
                j++;
            }
        }
        while (i<n) { // if elements left in arr
            if(union.get(union.size()-1)!=arr[i])
                union.add(arr[i]);
            i++;
        }
        while (j<m) { // if elements left in arr1
            if(union.get(union.size()-1) !=arr1[j])
                union.add(arr1[j]);
            j++;
        }
        return union ;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,4,5};
        int[] arr1= {1,2,2,4,5,6};

       // System.out.println(bruteUnion(arr,arr1));
        ArrayList<Integer> union = optimalUnion(arr, arr1);


        for(int val: union){
            System.out.print(val+" ");
        }
    }
}

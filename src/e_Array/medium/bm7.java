package e_Array.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//next_permutation
public class bm7
{
    public static List<Integer> Brute(List<Integer>a){
//        do this brute approach while revise;
        int n=a.size(); // size of the array;

//        step 1 find the breaking point
        int ind=-1;  // stores the index of the breaking point
        for(int i=n-2;i>=0;i--){// n-1 leads to index out of bound
            if (a.get(i)<a.get(i+1)){
                ind=i;
                break;
            }
        }
//        if breaking point doesnot exist
        if (ind == -1) {
            Collections.reverse(a);
            return a;
        }



        return a;

    }
    public static void main(String[] args)
    {
        List<Integer> a= Arrays.asList(new Integer[]{2, 1, 5, 4, 3, 0, 0});
        List<Integer> ans= Brute(a);

        System.out.print("Next permutation is [");
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i)+ "");
        }
        System.out.println("]");
    }
}

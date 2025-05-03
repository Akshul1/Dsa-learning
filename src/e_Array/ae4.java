package e_Array;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

//Remove duplicates from the array
public class ae4
{
    static int[] Brute(int[]arr){
//        iam not able to run this in the leetcode;
        Set<Integer>set= new TreeSet<>();
        for(int nums:arr){
            set.add(nums);
        }

//        convert the set into array
        int []unique=new int[set.size()];
        int i=0;

        for(int num: set){
            unique[i++]=num;
        }
        return unique;
    }

//    optimal
//    https://leetcode.com/problems/remove-duplicates-from-sorted-array/submissions/1622209927/
//    Approach-> Two pointer
//    Time O(n) spaceO(1);
    public static void main(String[] args)
    {
        int []arr= {1,1,1,3,3,3,4,4,5,6,7};
        int[] result = Brute(arr);
        System.out.println(Arrays.toString(result));
    }
}

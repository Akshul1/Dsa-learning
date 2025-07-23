package e_Array.easy;

import java.util.Arrays;
import java.util.Optional;

//Leetcode verion
public class ae3
{
    public static boolean Brute (int[]nums){
        int n=nums.length;

        for(int i=0;i<n;i++){
            int[] rotate=new int[n];

                for(int j=0;j<n;j++){
                    rotate[i]= nums[(j+i)%n];

                }
//                check if the rotate array is stored in the non decreasing order
                boolean isCurrentRotationStored= true;
                for(int j=0; j<n-1;j++){
                    if (rotate[j]>rotate[j+1]);
                    isCurrentRotationStored=false;
                    break;
                }

                if(isCurrentRotationStored){
                    return true;
                }
        }
        return false;
    }
    public static boolean Optimal(int[]nums){
        int n= nums.length;
        int count=0;

        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n])
            count++;
        }
        return count<=1;
    }
    public static void main(String[] args) {
        int []num={3,4,5,1,2};

        System.out.println("Input "+ Arrays.toString(num));
        System.out.println("Result "+ Optimal(num));
    }
}

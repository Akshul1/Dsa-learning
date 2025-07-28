package e_Array.easy;

import java.util.Arrays;

public class ae3 {
    public static boolean Optimal(int []nums){
        int n=nums.length;
        int count=0;

        for(int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n])
//                1 % 5 = 1     works like this till 4 after that 5 % 5 = 0 helps to get to the first index
                count++;

        }
        return count <=1;
    }
    public static void main(String[] args) {
        int []nums={3,4,5,1,2};

        System.out.println("Input "+ Arrays.toString(nums));
        System.out.println(Optimal(nums));
    }
}
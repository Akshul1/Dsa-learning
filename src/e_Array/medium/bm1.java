package e_Array.medium;

import java.util.Arrays;
import java.util.HashMap;

//2Sum Problem
public class bm1
{
    public static int[] brute(int[]arr, int target){
        int n= arr.length;

        for(int i=0;i<n;i++){
            for (int j = i+1; j <n ; j++) {

                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }
    public static int[] better (int[]arr, int target) {
        int n = arr.length;
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;

        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreneeded = target - num;
            if (mpp.containsKey(moreneeded)) {
                ans[0] = mpp.get(moreneeded);
                ans[1] = i;

                return ans;
            }
            mpp.put(arr[i], i);
        }

        return new int[]{-1};
    }
    public static int[] optimal(int[]arr, int target){
//        main goal is to return the index values like better
        int n=arr.length;
        Arrays.sort(arr);  // 1st sort the array
        int left=0,right=n-1;   // initial index of pointers

        while (left<right){
            int sum= arr[left]+arr[right];
            if (sum==target){
                return new int[]{left,right};
            } else if (sum<target) {
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1};

    }
    public static void main(String[] args) {
        int target =14;
        int[] arr= {2,6,5,8,11};
        int []ans= optimal(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}

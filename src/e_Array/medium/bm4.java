package e_Array.medium;

public class bm4
{
    public static int brute(int[]arr,int n){
        int maxi= Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){

                int sum=0;
                for(int k=i;k<j;k++){
                    sum+=arr[k];
                }
                maxi= Math.max(maxi,sum);
            }
        }

        return maxi;

//        TC O(n^3)  SC O(1);
    }
    public static int better(int[]arr, int n){
        int maxi1=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                maxi1=Math.max(maxi1, sum);
            }

        }

        return maxi1;
    }
    public static int optimal(int[]arr, int n){
        int maxi=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0;i<n;i++){

            sum+=arr[i];

            if (sum>maxi){
                maxi=sum;
            }

            if (sum<0){
                sum=0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = optimal(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}

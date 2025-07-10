package e_Array;
//Longest subarray with given sum K(positives)
public class ae12
{
    public static int brute(int[] arr,long k){
        int n=arr.length;
        int len=0;

        for (int i=0;i<n;i++){
            for(int j=i;j<n;j++){

                int sum=0;
                for(int l=i;l<=j;l++){
                    sum+=arr[l];

                }
                if(sum==k)
                    len=Math.max(len,j-i+1);

            }
        }

        return len;
    }
    public static int brutee(int[] arr, int k){
        int n=arr.length;
        int len =0;

        for(int i=0;i<n;i++){
            int s=0;
            for(int j=i;j<n;j++){
                s+=arr[j];
                if(s==k)
                    len=Math.max(len,j-i+1);
            }

        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 9};
        long k = 10;
        int len = brute(arr, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}

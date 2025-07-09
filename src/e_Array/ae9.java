package e_Array;
//Find the missing no. in the array
public class ae9
{
    public static int brute(int[]arr, int n)
    {// using linear search

        for (int i = 1; i <= n; i++) {

            //flag to check weather the element is present or not
            int flag= 0;

            //loop for linear search
            for(int j=0;j<n-1;j++){
                if(arr[j]==i){
                    flag=1; //if the element is present
                }
            }
            if(flag==0) return i;

        }
        return -1;
        // it has  no use only for removing the warning;
    }
    public static int better(int[] arr, int n)  //using hashing
    {
        int [] hash = new int[n+1];

        for(int i=0;i<n-1;i++){
            hash[arr[i]]++; // it increments the value at hash[a[i]] by 1.

        }
        for(int i=1;i<=n;i++){
            if(hash[i]==0)
                return i;
        }
        return -1; //no use only for the warning;
    }
    public static int optimal(int[] arr, int n){//using sum         https://leetcode.com/problems/missing-number/submissions/1692278726/
//        sum of first n numbers
        int sum= (n*(n+1))/2;

        int sum2= 0;
        for (int i=0;i<n-1;i++){
            sum2+=arr[i];

        }
        int missingNum= sum-sum2;
        return missingNum;
    }
    public static int optimal_1(int[] arr, int n){//using XOR
      //  https://leetcode.com/problems/missing-number/submissions/1692378333/
        int xor1=0, xor2=0;
        for(int i=0;i<n-1;i++){
            xor2= xor2^arr[i];
            xor1=xor1^(i+1);// this only goes till n-1

        }

        xor1=xor1^n; // this adds last element

        return xor1^xor2;

    }
    public static void main(String[] args) {
        int[] arr= {1,3,4,5};
        int n= arr.length;

        int ans= optimal(arr,n);
        System.out.println("Missing no. is "+ans);
    }
}

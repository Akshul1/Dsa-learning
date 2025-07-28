package e_Array.easy;

public class ae5_1
{
    public static void shifttoright(int[]arr, int n, int k){      //https://leetcode.com/problems/rotate-array/submissions/1714284538/
//        Always use k = k % n to handle cases when k >= n.
//Consider edge cases: empty array, k = 0, k = n.
        if(n==0||k>n)
            return;
//        temp
        int[]temp= new int[k];
        for (int i= n-k;i<n;i++){
            //   5= 7-2   7
            temp[i-n+k]=arr[i];
            //   5-7 2
        }
//        move elements to right(decrementing loop)
        for(int i=n-k-1;i>=0;i--){
            arr[i+k]=arr[i];
        }
//        add temp elements in the array;
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }

    }
    public static void Reverse(int[]arr, int start, int end){

        while (start<=end){
            int temp= arr[start];
            arr[start]=arr[end];
            arr[end]= temp;
            start++;
            end--;

        }
    }
    public static void Optimal(int[]arr, int n, int k){
        Reverse(arr,0,n-k-1);

        Reverse(arr,n-k,n-1);

        Reverse(arr,0,n-1);
    }
    public static void main(String[] args)
    {
        int[]arr= {1,2,3,4,5,6,7};
        int n= 7;// lenght of array
        int k=2;// no. of elements to move in the arrary
//        shifttoright(arr,n,k);
        Optimal(arr,n,k);
        System.out.println("Array after rotating");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

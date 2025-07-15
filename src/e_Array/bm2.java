package e_Array;
//Sort an array of 0's 1's and 2's
public class bm2
{
    public static void Brute(){
//    uae any sorting method to solve this
//        time complecity is 0(N log N)
//        space complecity is O(N);g

    }
    public static void Better(int[]arr,int n){
        int cout0=0,cout1=0,cout2=0;

        for(int i=0;i<n;i++){
            if(arr[i]==0)cout0++;
            else if(arr[i]==1)cout1++;
            else  cout2++;
        }

        for(int i=0;i<cout0;i++) arr[i]=0;
        for(int i=cout0;i<cout0+cout1;i++) arr[i]=1;
        for(int i=cout0+cout1;i<n;i++) arr[i]=2;
    }
    public static void Optimal(int[]arr, int n){
        int low=0,mid=0,high=n-1;  // three pointers

        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;

                low++;
                mid++;

            } else if (arr[mid]==1) {
                mid++;
            }else{
                int temp1= arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp1;

                high--;
            }
        }
    }

    public static void main(String[] args) {
        int n = 6;
        int []arr= new int[] {0, 2, 1, 2, 0, 1};

        Optimal(arr, n);
        System.out.println("After sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

package e_Array;
//LINEAR SEARCH ARRAY EASY
public class e7
{
    public static int brute(int[] arr, int n){
        int num=4;
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr={1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
        int n= arr.length;

        int index= brute(arr,n);

        if (index != -1) {
            System.out.println("Number 4 found at index: " + index);
        } else {
            System.out.println("Number 4 not found in the array.");
        }

    }
}

package e_Array.easy;
// FIND THE SECOND LARGEST NO IN AN ARRAY



//OPTIMAL-2Pointer Approach
//Time complexity O(n), Space complexity O(1);
public class ae2
{
    //BRUTE ->  first sort the arry and run the decrementing loop if the array is not the largest then break
//    time complexity O(n log n) + O(n)  space

    //BETTER ->first loop find the largest and 2nd loop find the second largest array
//Time complexity = O(2n), Space complexity =O(1);
    static int better(int []arr){
        int largest=-1;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>largest){
                largest= arr[i];
            }
        }
        int sLargest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>sLargest&&arr[i]!=largest){
                sLargest=arr[i];
            }
        }return sLargest;
    }
    static int optimal(int[]arr){
        int n= arr.length;
        if(n<2){
            return -1;
        }
        int larger= Integer.MIN_VALUE;
        int seLarger= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>larger){
                seLarger=larger;
                larger=arr[i];
            } else if (arr[i]>seLarger && arr[i]!= larger) {
                seLarger= arr[i];
            }
        }
        return seLarger;
    }

    public static void main(String[] args) {
        int []arr= {10,5,14,89,26,53,23,68,59,28,49};
        System.out.println(optimal(arr));
    }
}

package e_Array.medium;

public class bm5
{
    public static int brute(int[]arr){
        int maxpro =0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    maxpro=Math.max(arr[j]-arr[i],maxpro );
                }
            }
        }
        return maxpro;
    }
    public static int optimal(int[]arr){
        int maxpro=0,min=Integer.MAX_VALUE;


        for (int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            maxpro=Math.max(maxpro,arr[i]-min);
        }
        return maxpro;
    }
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int ans= brute(arr);
        System.out.println(ans);
    }
}

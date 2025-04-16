package d_Sorting;
//Part 1 sorting
import java.util.Scanner;

public class c_Insertion
{
    static void selection_sort(int[]arr,int n){
        for(int i=0;i<=n-2;i++){
            int mini=i;
            for(int j=i;j<=n-1;j++){
                if (arr[j]<arr[mini]){
                    mini=j;
                }
            }
//            Swap
            int temp=arr[mini];
            arr[mini]= arr[i];
            arr[i]= temp;
        }
    }
    static void bubble_sort(int[]arr,int n){
        for (int i= n-1;i>=0;i--){
            int didSwap = 0;   //for optimization
            for (int j=0;j<=i-1;j++){
                if (arr[j]>arr[j+1]){
                   int temp= arr[j+1];
                   arr[j+1]=arr[j];
                   arr[j]= temp;
                   didSwap= 1;    //for optimization
                }
            }
            if (didSwap==0){
                break;             //for optimization
            }
            System.out.println("runs");
        }
    }
    static void insertion_sort(int[]arr ,int n){

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr= new int[n];

        for (int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
//        selection_sort(arr,n);
        bubble_sort(arr,n);
        for(int i =0; i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}

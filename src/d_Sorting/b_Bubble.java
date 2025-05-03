package d_Sorting;
//NOT WORKING HAVE TO SOLVE THE ERRORS
import java.util.Scanner;

public class b_Bubble
{
    public void bubble_sort(int []arr,int n){
        for (int i=n-1;i>=0;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tem=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tem;
                }
            }
        }
        System.out.println("After Bubble sort");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        Created an array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements in the array");
        int n= sc.nextInt();
        int []arr= new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

//        Printing unsorted array
        System.out.println(" Before sorting the array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println(); // For neat spacing


//        Calling the function
        b_Bubble b=new b_Bubble();
        b.bubble_sort(arr, n);
    }

}

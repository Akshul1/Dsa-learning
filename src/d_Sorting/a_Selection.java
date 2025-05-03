package d_Sorting;

import java.util.Scanner;

public class a_Selection
{
    public void selection_sort(int[]arr, int n){
        for(int i=0; i<n;i++){
            int min= i;
            for(int j=i;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
//            Swap
            int temp= arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
//        Print
        System.out.println("After sorting the array");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
//        Created a array
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

//        Calling the function
        System.out.println();

        a_Selection a=new a_Selection();
        a.selection_sort(arr,n);

    }
}

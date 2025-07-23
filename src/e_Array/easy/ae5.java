package e_Array.easy;
// Left rotate the array
public class ae5
{
    static int[] onePlace(int[]arr){
//        Left rotate the element by one place(page36)
        int temp= arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        return arr;
    }
    public static void main(String[] args)
    {
        int []arr= {1,2,3,4,5,6,7};

        System.out.println("Original Array");
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();

//        left rotate by one place
        arr= onePlace(arr);

        System.out.println("Array after rotating one element to left ");
        for(int i:arr){
            System.out.print(i+" ");
        }





    }
}

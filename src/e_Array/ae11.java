package e_Array;

import java.util.HashMap;
import java.util.Map;

//Find the number that appears once, and other numbers twice.
public class ae11
{
    public static int brute(int[]arr){// using linear search
        int n= arr.length;

        for(int i=0;i<n;i++){
            int num= arr[i];
            int cout = 0;


            for(int j=0;j<n;j++){
                if(num==arr[j])
                    cout++;

            }
            if(cout==1)return num;
        }



        return -1;
    }
    public static int better(int[]arr){   //using hash array(hashing)
        int n= arr.length;

        int maxi= arr[0];
        for(int i=0;i<n;i++){
            maxi= Math.max(maxi,arr[i]);
        }// this find max element of the array, helps to make hasharray.

//        declare hash array of maxi+1;
        int[] hash= new int[maxi+1];
        for(int i=0;i<n;i++){
            hash[arr[i]]++;   // increases the count of the value arr[i] in the hash[] array by 1.
        }

//        find the single element and return the answer
        for(int i=0; i<n;i++){
            if (hash[arr[i]]==1){
                return arr[i];
            }
        }

        return -1;// no execution only to hide warning
    }
    public static int better_b(int[]arr)
    {// hashing using map data structure
//        when the no. is so big or negative we dont use hash array we use hash data strructure
        int n= arr.length;
//              key,    value     eg-> apple, 3  (count)
        HashMap<Integer,Integer> mpp= new HashMap<>();
        for(int i=0;i<n;i++){
            int value = mpp.getOrDefault(arr[i],0);
            mpp.put(arr[i],value+1 );

        }

//        find the single element and return the answer;
//        It returns a Set of all the key–value pairs (Map.Entry<K, V>) inside the map.(entrySet)
        for(Map.Entry<Integer,Integer>it: mpp.entrySet()){
            if(it.getValue()==1)
                return it.getKey();
        }


        return-1;
    }
    public static int optimal (int[]arr){     //    https://leetcode.com/problems/single-number/submissions/1693127045/
        int xor=0;

        for(int i=0; i<arr.length;i++){
            xor=xor^arr[i];
        }
        return xor;

//      Time Complexity: O(N), where N = size of the array.
//Reason: We are iterating the array only once.
//
//Space Complexity: O(1) as we are not using any extra space.
    }
    public static void main(String[] args) {

        int[] arr = {4, 1, 2, 1, 2};
        int ans = better_b(arr);
        System.out.println("The single element is: " + ans);
    }
}

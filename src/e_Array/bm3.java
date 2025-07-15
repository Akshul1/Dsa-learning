package e_Array;

import java.util.HashMap;
import java.util.Map;

public class bm3
{
    public static int brute(int[]arr){
        int n=arr.length;

        for(int i=0;i<n;i++){
            int cout=0;
            for(int j=0;j<n;j++){
                if(arr[j]==arr[i])cout++;
            }
            if (cout>(n/2))return arr[i];
        }
//tc= O(n^2) sc=O(1)
        return-1;
    }

    public static int better(int[]arr){  //https://leetcode.com/problems/majority-element/submissions/1698917671/
        int n=arr.length;

        //        declare the hashmap
    HashMap<Integer,Integer>mpp=new HashMap<>();

       //sotirng tha elements with the occurance
    for(int i=0;i<n;i++){
        int value= mpp.getOrDefault(arr[i],0);
        mpp.put(arr[i],value+1);
    }

//    //searching for the majority element:
    for(Map.Entry<Integer,Integer> it: mpp.entrySet()){
        if(it.getValue()>(n/2)){
            return it.getKey();
        }
    }
//Time Complexity: O(N*logN) + O(N), where N = size of the given array.
//Reason: We are using a map data structure. Insertion in the map takes logN time. And we are doing it for N elements. So, it results in the first term O(N*logN). The second O(N) is for checking which element occurs more than floor(N/2) times. If we use unordered_map instead, the first term will be O(N) for the best and average case and for the worst case, it will be O(N2).
//
//Space Complexity: O(N) as we are using a map data structure.

        return -1;
    }
    public static int optimal(int[]arr){//https://leetcode.com/problems/majority-element/submissions/1698962507/
        int n=arr.length;
        int cout=0;
        int element =0;

        for(int i=0;i<n;i++){
            if(cout==0){
                cout=1;
                element=arr[i];
            }else if(element==arr[i])cout++;
            else cout--;

        }

        int cout1=0;
        for(int i=0;i<n;i++){
            if(arr[i]==element)cout1++;
        }

        if(cout1>(n/2))return element;
        return-1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = optimal(arr);
        System.out.println("The majority element is: " + ans);
    }
}

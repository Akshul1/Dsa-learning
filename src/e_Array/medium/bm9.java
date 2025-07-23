package e_Array.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//  Longest Consecutive Sequence in an Array..
public class bm9
{
    public static boolean linearSearch(int[]a, int num){
        int n=a.length;

        for(int i=0;i<n;i++) {
            if (a[i]==num){
                return true;
            }
        }
        return false;
    }
    public static int Brute(int[]a){
        int cout=1,longest=1;

//        pick a no.& search for conseuitive no
        for(int i=0;i<a.length;i++){
            int x= a[i];
//            using linear search
            while(linearSearch(a,x+1)==true){
                x+=1;
                cout+=1;

            }
            longest=Math.max(longest,cout);
        }
        return longest;
    }
    public static int Better(int[] a){
        int n=a.length;
        if(n==0) return 0;

//        sort the array
        Arrays.sort(a);
        int lastSmall= Integer.MIN_VALUE;
        int cut=0, longest=1;

//        find the longest sequence;
        for(int i=0;i<n;i++){
            if (a[i]-1==lastSmall){
                cut+=1;
                lastSmall=a[i];

            } else if (a[i]!=lastSmall) {
                cut=1;
                lastSmall=a[i];
            }
            longest=Math.max(longest,cut);
        }
        return longest;
    }
    public static int Optimal(int[]a){
        int n=a.length;
         if(n==0)return 0;

         int longest=1;
        Set<Integer> se= new HashSet<>();

//        put all the elements in the set;
        for(int i=0;i<n;i++){
            se.add(a[i]);
        }


//        find the longest sequence;
         for(int it:se){
//            if it is a starting no
            if(!se.contains(it-1)){
                int cunt=1;
                int x=it;

                while(se.contains(x+1)){
                    x=x+1;
                    cunt = cunt+1;

                }
                longest=Math.max(longest,cunt);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int []a= {100,200,1,2,3,4};
        int ans=Optimal(a);
//        brute is not working fine
        System.out.println("Longest consequitive sequence is "+ ans);
    }
}

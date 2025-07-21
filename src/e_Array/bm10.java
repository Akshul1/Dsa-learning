package e_Array;

import java.util.ArrayList;
import java.util.Arrays;

//  Set Matrix Zeros
public class bm10
{
    static ArrayList<ArrayList<Integer>>Brute(ArrayList<ArrayList<Integer>> matrix, int n, int m){

    }
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,0,0,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,0,1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,1,1,1)));

        int n= matrix.size();
        int m= matrix.get(0).size();

        ArrayList<ArrayList<Integer>> ans= Brute(matrix,n,m);

        for(ArrayList<Integer> row :ans){
            for(Integer ele: row){
                System.out.print(ele+ " ");
            }
            System.out.println();
        }

    }
}

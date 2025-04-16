package c_Hashing;

import java.util.Scanner;

//Character hashing
public class b
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.next();

//        precomputation
        int[] hash=new int[26];
        for (int i= 0; i<s.length();i++){
            char ch = s.charAt(i);
            hash[ch - 'a']++;

        }

        int q= sc.nextInt();
        while (q>0){
            char ch=sc.next().charAt(0);
//            Fetch
            System.out.println(hash[ch-'a']);
        }
    }
}

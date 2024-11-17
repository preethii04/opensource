import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int count;
            if(n>m){
                count = n-m;
            } else{
                count =0;
            }
            System.out.println(count);
        }
        sc.close();
    }
}

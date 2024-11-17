import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max=0;
        int streak=0;
        for(int i=0;i<n;i++){
            int attendance = sc.nextInt();
            if(attendance == 0){
                streak++;
                max = Math.max(max, streak);
            } else{
                streak=0;
            }
        }
        System.out.println(max);
        sc.close();
    }
}

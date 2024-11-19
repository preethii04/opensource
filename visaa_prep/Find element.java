import java.io.*;
import java.util.*;

public class Solution {
    public static int lsearch(int size,int nums[], int t){
        for(int i=0;i<size;i++){
            if(nums[i]==t){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int nums[] = new int[size];
        for(int i=0;i<size;i++){
            nums[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        System.out.println(lsearch(size,nums,t));
        
    }
}

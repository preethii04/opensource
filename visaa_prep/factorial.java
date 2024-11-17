import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long factorial =1;
        if(n==0 || n==1){
            factorial =1;
        } else{
            for(int i=2;i<=n;i++){
            factorial=factorial*i;
            }
        }
        System.out.println(factorial);
    }
}

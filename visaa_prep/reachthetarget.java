import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {        
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int runs = x-y+1;
            if(runs<=0){
                System.out.println(0);
            } else {
                System.out.println(runs);
            }
        }
        sc.close();
    }
}

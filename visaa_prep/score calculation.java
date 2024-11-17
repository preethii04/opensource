import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int i =0;i<test;i++){
            int x = sc.nextInt();
            int n = sc.nextInt();
            int points = x/10;
            int score = points * n;
            System.out.println(score);
        }
        sc.close();
    }
}

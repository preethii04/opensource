import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        long n= sc.nextLong();
        long result = 0;
        long count3 = n/3;
        long count5 = n/5;
        long count15 = n/15;
        long res = count3+count5-count15;
        System.out.println(res);
        sc.close();
    }
}

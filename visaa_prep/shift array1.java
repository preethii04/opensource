import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        int firstel = array[0];
        for(int i=0;i<n-1;i++){
            array[i] = array[i+1];
        }
        array[n-1] = firstel;
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        sc.close();
    }
}

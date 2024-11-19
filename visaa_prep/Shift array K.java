import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        k=k%size;
        int[] newarr = new int[size];
        for(int i=0;i<k;i++){
            newarr[i] = arr[size-k+i];
        }
        for(int i=k;i<size;i++){
            newarr[i] = arr[i-k];
        }
        for(int i=0;i<size;i++){
            System.out.print(newarr[i]+" ");
        }
        sc.close();
    }
}

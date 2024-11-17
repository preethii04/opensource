import java.util.Scanner;

public class Solution {
    static int search(int[] arr, int x){
        int l=0;
        int r = arr.length -1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == x){
                return mid;
            } else if(arr[mid] < x){
                l = mid+1;
            } else {
                r = mid -1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(search(arr, x));
    }
}

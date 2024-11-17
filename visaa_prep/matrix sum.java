import java.util.Scanner;
public class Solution{
    public static void main(String[] args) throws java.lang.Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] rowsum = new int[n];
        int[] colsum = new int[n];
        for(int k=0;k<n;k++){
            for(int l=0;l<n;l++){
                rowsum[k]+=matrix[k][l];
                colsum[l]+=matrix[k][l];
            }
        }
        int[] arr = new int[n];
        for(int m=0;m<n;m++){
            arr[m]= rowsum[m]+colsum[m];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
}

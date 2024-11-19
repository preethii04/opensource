import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] grid = new int[rows][cols];
        boolean[] rowsToOff = new boolean[rows];
        boolean[] colsToOff = new boolean[cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                grid[i][j] = sc.nextInt();
                if(grid[i][j]==0){
                    rowsToOff[i] = true;
                    colsToOff[j] = true;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(rowsToOff[i] || colsToOff[j]){
                    grid[i][j]=0;
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }

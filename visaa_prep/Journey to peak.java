import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int height[] = new int[n];
        for(int i=0;i<n;i++){
            height[i]= sc.nextInt();
        }
        int Altitude = 0;
        int maxAltitude = Altitude;
        for(int trheight : height){
            Altitude += trheight;
            if(Altitude > maxAltitude){
                maxAltitude = Altitude;
            }
        }
        System.out.println(maxAltitude);
        sc.close();
    }
}

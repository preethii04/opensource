import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str ="";
        for(int i=0;i<s.length();i++){
            if(Character.isLowerCase(s.charAt(i))){
                str += Character.toUpperCase(s.charAt(i));
            } else {
                str += Character.toLowerCase(s.charAt(i));
            }
        }
        System.out.println(str);
        sc.close();
    }
}

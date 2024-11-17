import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int l = str.length();
        boolean palindrome= true;
        for(int i=0;i<l/2;i++){
            if(str.charAt(i) != str.charAt(l-i-1)){
                palindrome=false;
                break;
            }
        }
        if(palindrome)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");
        sc.close();
    }
}

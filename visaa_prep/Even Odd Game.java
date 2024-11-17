import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String num= sc.nextLine();
        int sum=0;
        for(int i=0;i<num.length();i++){
            sum += Character.getNumericValue(num.charAt(i));
        }
        if(sum % 2 ==0){
            System.out.println("Vignesh");
        } else{
            System.out.println("Charan");
        }
    }
}

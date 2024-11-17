import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        int z= sc.nextInt();
        if(z>=x){
            z = z-x;
            if(z>=y){
                System.out.println("2");
            }
            else{
                System.out.println("1");
            }
        } else{
            System.out.println("0");
        }
        sc.close();
    }
}



import java.util.*;
public class Basics {
    public static void checkPalindrome(int a){
        
        int rev=0;
        while(a>0){
            int lastDigit=a%10;
            rev= rev+ lastDigit;
            a=a/10;
        }
    System.out.println(rev);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int a=sc.nextInt();
       checkPalindrome(a);


    }
    
}

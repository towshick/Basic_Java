
package basic.java;

import java.util.Scanner;

public class Conditional_Operator 
{
    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        
        int a,b,large;
        
        System.out.print("Enter two Integer:");
        a = input.nextInt();
        b= input.nextInt();
        
        large=(a>b)? a:b;
        System.out.print("Large number is :" + large);
  
    }
}

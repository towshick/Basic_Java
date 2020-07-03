
package basic.java;

import java.util.Scanner;

public class EvenOdd
{
    public static void main(String[] args) {
            
        Scanner input = new Scanner(System.in);
        
        int a;
        
        System.out.print("Enter an Integer value:");   
        a = input.nextInt();
        
        if(a%2==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        } 
        
    }
}

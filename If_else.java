
package basic.java;

import java.util.Scanner;


public class If_else 
{
    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        
        int a;
        
        System.out.print("Enter an integer value:");
        a = input .nextInt();
        
        if(a>0)
        {
            System.out.println("Positive");
        }
        else if(a<0)
        {
            System.out.println("Negative");
        } 
        else
        {
            System.out.println("Zero");
        }
    }
}

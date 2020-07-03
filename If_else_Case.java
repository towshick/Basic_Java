
package basic.java;

import java.util.Scanner;

public class If_else_Case 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        char x;
        
        System.out.print("Enter an Alphabet:");
        x= input.next().charAt(0);
        
        
        if(x>='a' && x<='z')
        {
            System.out.println("Small Letter");
        }
        
        else if(x>='A' && x<='Z')
        {
            System.out.println("Capital Letter");
        }
        else
        {
            System.out.println("Invalid Charcter");
        } 
    }
}

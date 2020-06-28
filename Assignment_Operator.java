
package basic.java;

import java.util.Scanner;


public class Assignment_Operator

{
    public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);
      
      int a;
      int b;
      //int result;
      
        System.out.print("Enter First Integer:");       
        a = input.nextInt();
        
        System.out.print("Eter Second integer:");
        b = input.nextInt();
        
        a +=b;
        System.out.println("Sum = " +a);
        a =a-b;
        System.out.println("Sub = " +a);
        a *=b;
        System.out.println("Mul = " +a);
        a /=b;
        System.out.println("Div = " +a);
       
    }
}


package basic.java;

import java.util.Scanner;


public class ArithmeticOperator 
{
    public static void main(String[] args)
    
    {
        Scanner input = new Scanner(System.in);
        double a;
        double b;
        double result;
        
        System.out.print("Enter First Number : ");
        a = input.nextDouble();
        System.out.print("Enter Second Number : ");
        b = input.nextDouble();
        
        
        result = a+b;
        System.out.println("Sum = " +result);
        result = a-b;
        System.out.println("Sub = " +result);
        result = a*b;
        System.out.println("Mul = " +result);
        result = a/b;
        System.out.println("Div = "  +result);
        result = a%b;
        System.out.println("Mod = " +result);
        
        
    }
}


package basic.java;

import java.util.Scanner;


public class Switch_Calculator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        double a,b;
        char x;
        
        System.out.print("Enter First integer:");
        a= input.nextDouble();
        
        
        System.out.print("Enter Expression:");
        x = input.next().charAt(0);
        
        
        System.out.print("Enter Second integer:");
        b= input.nextDouble();

        
        switch(x)
        {
            case'+':
                    System.out.printf("%.2f+%.2f = %.2f " , a,b,a+b);
                    break;
  
            case'-':
                    System.out.printf("%.2f-%.2f = %.2f " , a,b,a-b);
                    break;

            case'*':
                    System.out.printf("%.2fx%.2f = %.2f " , a,b,a*b);
                    break;

            case'/':
                    System.out.printf("%.2f/%.2f = %.2f " , a,b,a/b);
                    break;
                    
            default:
                System.out.println("ERROE!!");
        }
    }
}

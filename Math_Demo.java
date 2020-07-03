
package basic.java;

import java.util.Scanner;


public class Math_Demo 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int a,b;
        
        System.out.print("Enter First Number :");
        a= input .nextInt();
        
        System.out.print("Enter Second Number :");
        b = input .nextInt();
        
        
        int max=Math.max(a, b);
        System.out.println("Maximum = " +max);
        
        int min = Math.min(a, b);
        System.out.println("Minimum = " +min);
        
        int absolute=Math.abs(a);
        System.out.println("Absolute Value of First Number =" +absolute);
        
        double power =Math.pow(a, b);
        System.out.println("Power = " +power);
        
        double pI = Math.PI;
        System.out.println("pI = "+pI); 
        
        
        float c;
        System.out.print("Enter any float value :");  /*Round Figure of any float value*/
        c = input.nextFloat();
        
        float round = Math.round(c);
        System.out.println("Round figure =" +round);
            
 
    }
    
}

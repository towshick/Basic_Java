
package basic.java;

import java.util.Scanner;

public class CelciusToFarenhite 
{
    public static void main(String[] args) 
    
    
    
    {
        Scanner input = new Scanner(System.in);
        
        double celcius , result;
        
        System.out.print("Enter Celcius Value :");
        celcius = input .nextDouble();
        
        result = (celcius/5) * 9 +32;
        System.out.printf("Farenhite value of %.2f is = %.2f" , celcius , result);
        
    }
}

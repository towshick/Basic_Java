
package basic.java;

import java.util.Scanner;


public class User_Input
{
    public static void main(String[] args) 
    {
      
               
               
        Scanner input/*Variable*/ = new Scanner(System.in) ;  
        
        
         /*int a;
        
               
         System.out.print("Enter any number:");    
         a=input.nextInt();
       System.out.printf("Number= %d" , a);  */
       
       /************************************************************/
       
       String name;
       System.out.print("Enter your name: ");
       name = input.nextLine();
       System.out.print("\nWelcome : "+name);
      
          
       
       
   
     
        
       
    }
}

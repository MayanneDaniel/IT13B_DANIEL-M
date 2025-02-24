/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRELIM;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class LAB_EXERCISE2 {
    
    public static void main(String[]args){
        
        Scanner scanner = new Scanner (System.in);
        
     
               
               System.out.print(" Input First Number: ");
               int num1 = scanner.nextInt();
               
               System.out.print(" Input Second Number: ");
               int num2 = scanner.nextInt();
               
               System.out.print(" Input Third Number: ");
               int num3 = scanner.nextInt();
               
               int greatest = num1;
               if (num2 > greatest){
                   greatest = num2;
               }
               if (num3 > greatest){
                   greatest = num3;
               }
               System.out.println("The greatest number is: " + greatest);
               
               scanner.close();
             
               
               
               
               
       
               
               
               
               
          
    
    
}
    

    
}

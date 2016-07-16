/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Prime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i,m=0,flag=0;    
  int n;
 Scanner in = new Scanner(System.in); //it is the number to be checked  
  n=in.nextInt();
 m=n/2; 
  
  for(i=2;i<=m;i++){    
   if(n%i==0){    
   System.out.println("Number is not prime");    
   flag=1;    
   break;    
   }    
  }    
  if(flag==0)    
  System.out.println("Number is prime");    
    }
}

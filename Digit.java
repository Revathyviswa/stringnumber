/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package digit;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Digit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int digit=0;
        System.out.println("enter the number");
        Scanner in=new Scanner(System.in);
       int n=in.nextInt();
        while(n!=0)
        {
            n=n/10;
            digit=digit+1;
        }
        System.out.println("the sum is"+digit);
    }
}

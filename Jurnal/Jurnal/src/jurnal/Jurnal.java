/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Jurnal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        int c = 1;
        int data;
        int total = 0;
        
        System.out.print("Input: ");
        Scanner show = new Scanner(System.in);
        data = show.nextInt();
        
        for(int i = 1; i <= data; i++){
            c = a+b; 
            System.out.print(c+"+");
            a = b;
            b = c;
            total = total+c;
            if(i==data){
                System.out.println(" = "+total);
            }
        }
        
    }
    
}

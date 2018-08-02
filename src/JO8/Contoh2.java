/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JO8;

import java.util.Scanner;

/**
 *
 * @author M E G A S T A R
 */
public class Contoh2 {
    public static void main(String[] args) {
        // For
        Scanner baca = new Scanner(System.in);
        int x, n;
        System.out.print("Masukkan nilai n: ");
            n = baca.nextInt();
        for(x = 1; x <= n; x++)
        {
            System.out.println(x + " ");
        }
        
        // While
        int i = 1;
        while(i <= 10)
        {
            System.out.println(i + " ");
            i++;
        }
        
        // Do While
        int j = 1;
        do
        {
            System.out.println(j + " ");
            j++;
        }
        while(j <= 10);
        
                
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JO8;

/**
 *
 * @author M E G A S T A R
 */
public class Contoh3 {
    public static void main(String[] args) {
        
        // Cara 1
        // Menampilkan 20 bilangan ganjil pertama
        int x = 1;
        
        for(x = 1; x <= 20; x+=2)
        {
            System.out.print(x + " ");
        } 
        
        System.out.println();
        
        // Menampilkan 20 bilangan genap pertma
        for(x = 2; x <= 20; x+=2)
        {
            System.out.print(x + " ");
        }  
        
        // Cara 2
        // Menampilkan 20 bilangan ganjil pertama
        System.out.println();
        for(x = 1; x <= 20; x++)
        {
            if(x % 2 == 1)
            {
                System.out.print(x + " ");
            }    
        }
        
        // Menampilkan 20 bilangan genap pertma
        System.out.println();
         for(x = 1; x <= 20; x++)
        {
            if(x % 2 == 0)
            {
                System.out.print(x + " ");
            }    
        }
    }
    
    
}

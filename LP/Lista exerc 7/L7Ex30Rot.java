/*
L7Ex29
 * 
 * 
 */

import java.util.Scanner;

public class L7Ex30Rot {
    
    public static void main (String[] args) {
        
        Scanner leiaStr = new Scanner ( System.in );
        
        String texto = "", 
               zp = "abcdefghijklmnopqrstuvwxyz", 
               pz = "nopqrstuvwxyzabcdefghijklm",
               saida = "";
        
        boolean encontrou = false;
        
               
        System.out.print("Entre com um texto: ");
        texto = leiaStr.nextLine();
        
        for ( int i = 0 ; i < texto.length() ; i++ ) {
            
            encontrou = false;
            
            for ( int j = 0 ; ! encontrou && j < zp.length() ; j++ ) { 
            
                if ( texto.charAt ( i ) == zp.charAt ( j ) ) {
                    
                    encontrou = true;
                    saida = saida + pz.charAt ( j );
                }
                                    
                //System.out.println("T.: " + texto.charAt ( i ) );
                //System.out.println("ZP: " + zp.charAt ( j ) );
                //System.out.println("S.: " + saida );
            }
            
            if ( ! encontrou ) {
                
                saida = saida + texto.charAt ( i );
            }
        }
        
        System.out.println("Saida: " + saida);
        
    }
}

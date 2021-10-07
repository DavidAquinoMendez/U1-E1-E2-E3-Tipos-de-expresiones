/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prolo1;

import java.util.Scanner;

/**
 *
 * @author cr7_3
 */
public class ExpresionLogica2 {
    Scanner leer = new Scanner(System.in);
    public ExpresionLogica2(){
        System.out.println("Ingresa la expresion");
        String Texto=leer.nextLine();
         String frase[] = Texto.split(" ");
         int conn=0,conc=0,cons=0;
         String elenum="";
         String elestr="";
         //hola
         String elecha="";
         for (int i = 0; i < frase.length; i++) {
             if (Numero(frase[i]) == true) {
                 elenum+=" "+frase[i];
                 conn++;
             }
             
             if (Numero(frase[i]) == false) {
                 
                 if(frase[i].length()==1){
                     elecha+=" "+frase[i];
                     conc++;
                 }else{
                 
                 elestr+=" "+frase[i];
                 cons++;}
             }
             
        }
         System.out.println("Los elementos de Numero son: "+elenum);
        System.out.println("El total de elementos de Numero es: "+conn);
         System.out.println("Los elementos de Cadena son: "+elestr);
        System.out.println("El total de elementos de Cadena es: "+cons);
         System.out.println("Los elementos de Caracter son: "+elecha);
        System.out.println("El total de elementos de Caracter es: "+conc);
        
        
}
    
    public static boolean Numero(String cadena) {

        boolean resultado;

        try {
            Double.parseDouble(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
 
}

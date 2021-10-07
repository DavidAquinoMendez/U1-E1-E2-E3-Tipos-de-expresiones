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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer =new Scanner(System.in);
        boolean continuar=true;
        int opcion;
        while(continuar){
            System.out.println("");
            System.out.println("1.- Expresion aritmetica");
            System.out.println("2.- Expresion logica");
            System.out.println("3.- Expresion logica 2");
            System.out.println("4.- Salir");
            opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    ExpresionAritmetica x=new ExpresionAritmetica();
                    break;
                case 2:
                    ExpresionLogica y=new ExpresionLogica();
                    break;
                case 3:
                    ExpresionLogica2 y2=new ExpresionLogica2();
                    break;
                case 4:
                    continuar=false;
                    break;
                default:
                    System.out.println("La opcion que escogiste no es valida");
                    break;
            }
        }
    }
    
}

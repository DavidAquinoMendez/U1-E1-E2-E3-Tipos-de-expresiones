/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prolo1;

import static com.mycompany.prolo1.ExpresionAritmetica.infixToPostfix;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author cr7_3
 */
public class ExpresionLogicaar {
        Scanner leer = new Scanner(System.in);
     //Entrada de datos
        public ExpresionLogicaar(){
    System.out.println("Escribe una expresión algebraica: ");
//**( 9 + .89 ) * 1 / 4 ^ 2 - 2  -1.381875
 Scanner leer = new Scanner(System.in);
 
    //Depurar la expresion algebraica
    String infix = leer.nextLine();
        
System.out.printf("Postfija: %s%n", infixToPostfix(infix));


//*****codigo para obtener el resultado de la operacion 
String[] post = infixToPostfix(infix).split(" ");   
   
    //Declaración de las pilas
    Stack < String > E = new Stack < String > (); //Pila entrada
    Stack < String > P = new Stack < String > (); //Pila de operandos

    //Añadir post (array) a la Pila de entrada (E)
    for (int i = post.length - 1; i >= 0; i--) {
      E.push(post[i]);
    }

    //Algoritmo de Evaluación Postfija
    String operadores = ">^";
    while (!E.isEmpty()) {
      if (operadores.contains("" + E.peek())) {
        P.push(evaluar(E.pop(), P.pop(), P.pop()) + "");
      }else {
        P.push(E.pop());
      }
    }

    //Mostrar resultados:
   
    System.out.println("Resultado: " + P.peek());
    
}
        
    static String infixToPostfix(String infix) {
/*Para averiguar la precedencia, tomamos el índice del
token en la cadena de operaciones y dividir por 2 (redondeando hacia abajo).
Esto nos dará: 0, 0, 1, 1, 2  */
final String ops = ">^";
 
StringBuilder sb = new StringBuilder();
Stack<Integer> s = new Stack<>();
 
for (String token : infix.split("\\s")) {
if (token.isEmpty())
continue;
char c = token.charAt(0);
int idx = ops.indexOf(c);
 
// comprobar si hay operador
if (idx != -1) {
if (s.isEmpty())
s.push(idx);
 
else {
while (!s.isEmpty()) {
int prec2 = s.peek() / 2;
int prec1 = idx / 2;
if (prec2 > prec1 || (prec2 == prec1 && c != '^'))
sb.append(ops.charAt(s.pop())).append(' ');
else break;
}
s.push(idx);
}
}
else if (c == '(') {
s.push(-2); // -2 significa '('
}
else if (c == ')') {
// Hasta '(' en la pila, operadoras pop.
while (s.peek() != -2)
sb.append(ops.charAt(s.pop())).append(' ');
s.pop();
}
else {
sb.append(token).append(' ');
}
}
while (!s.isEmpty())
sb.append(ops.charAt(s.pop())).append(' ');
return sb.toString();
}
    
    //*********metodo para obtener el resultado de la operacion 
    private static String evaluar(String op, String n2, String n1) {
    String num1 = n1;
    String num2 = n2;
    if (op.equals(">")) return (num1);
    
    
    return num1;
  }
}
        


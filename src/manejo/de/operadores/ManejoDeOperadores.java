/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejo.de.operadores;

/**
 *
 * @author berni
 */
public class ManejoDeOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Operadores Aritmeticos");
        int a = 1 + 2;
        int b = a * 4;
        int c = b / 2;
        int d = c - a;
        int e = -d;
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        
        System.out.println("\n Operador Modulo (residuo): ");
        System.out.println(" x mod 10 = "+ a % 2);
        
        System.out.println(" \n Operador Compuesto:");
        a += 2;
        b += 4;
        c *= a;
        
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("c = "+ c);
        
        System.out.println("\n Operador Incremento");
        // int a = a + 1;
        // Puede reescribirse como
        a++;
        System.out.println("a = "+ a);
        // Preincremento/ decremento (Primero lo incrementa y despues asigna el valor)
        c= ++a;
        // PostIncremento/ decremento (se incrementa despues de asignar el valor)
        // La siguiente vez que se evalua b, es cuando se incrementa
        d = b++;
        System.out.println("b = "+ b);
        System.out.println("c = "+ c);
        System.out.println("d = "+ d);
        
        System.out.println("\n Operador Relacional: ");
        boolean res = a < b;
        System.out.println("res = "+ res);
        System.out.println("\n Operador Ternario: ");
        int min = (a < b)? a : b;
        System.out.println("min = "+ min);
        System.out.println("\n Operador de asignacion: ");
        int i, j, k;
        
        i = j = k = 100;
        System.out.println("i = "+ i);
        System.out.println("j = "+ j);
        System.out.println("k = "+ k);
    }
    
}

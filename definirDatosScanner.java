/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Scanner;


public class definirDatosScanner {
    public static void main(String[] args){

        
        
        Scanner leer = new Scanner(System.in);

        
        System.out.print("Ingresa un valor unicode: ");
        String valor_unicode = leer.nextLine();
        
        System.out.print("Ingresa tu nombre: ");
        String nombre = leer.nextLine();
        
        System.out.print("Ingresa un numero entero: ");
        int entero = leer.nextInt();

        System.out.print("Ingresa un valor logico: ");
        boolean logico = leer.nextBoolean();

        System.out.print("Ingresa un valor decimal: ");
        double flotante = leer.nextDouble();

        if(entero < 10){
        System.out.println("el valor ingresado es menor que 10");
        }
        else{
        System.out.println("el valor ingresado es mayor que 10");
        }

      System.out.println("Tu nombre es: "+ nombre);
      System.out.println("El valor entero que ingresaste fue: "+entero);
      System.out.println("El valor logico que ingresaste fue:" + logico);
      System.out.println("El valor flotante que ingresaste fue: "+flotante);
      System.out.println("El valor unicode que ingresaste fue: "+valor_unicode);

      

    }     


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class calculoDosNumeros {
    public static void main(String[] args){
    
    Scanner leer = new Scanner(System.in);
    
    
    System.out.print("Ingresa el primer numero:");
    int numero1 = leer.nextInt();
    
    System.out.print("Ingresa el segundo numero:");
    int numero2 = leer.nextInt();
    
    
        if (numero1 > 25 && numero2 > 25){
            System.out.println("Los dos numeros ingresados son mayores a 25");
        }
        else if (numero1 > 25 ){
            System.out.println("El primer numero es mayor que 25");
        }
        else if (numero2 > 25 ){
            System.out.println("El segundo numero es mayor que 25");
        }
        else{
            System.out.println("Ninguno de los 2 numneros es mayor que 25");
        }

    
    }
            
    
}

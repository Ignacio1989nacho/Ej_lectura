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
public class Ejercicio7_bucle_switch {
    public static void main(String[] args){
    
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Escoje una opcion:");
    String tipoMotor = leer.nextLine(); 
    
    switch (tipoMotor) {
    
        case "1":
            System.out.println("la bomba es una bomba de agua");
            break;
        case "2":
            System.out.println("La bomba es una bomba de gasolina");
            
            break;
        case "3":
            System.out.println("La bomba es una bomba de pasta alimenticia");
            
            break;
        case "4":
            System.out.println("la bomba es una bomba de pedos");
            break;
        default:
            System.out.println("No existe un valor válido para EL tipo de bomba");
           
    }
            
    
    }
          
    }

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
public class Ejercicio13_vector {
    public static void main(String[] args){
        
        
    String [] equipo = new String[4];
    
    boolean total = e(equipo);
    String imprimir_nombres = nom(equipo);
    System.out.println(imprimir_nombres);
    }
    
   public static boolean e(String []equipo){
    
       boolean e = true;
       
       Scanner leer = new Scanner(System.in);
       for (int i = 0; i < (equipo.length); i++) {
           System.out.println("Ingresa los nombres de tus compañeros:");

           equipo[i] = leer.nextLine();
       }

       return e;
   }
   
  public static String nom(String []equipo){
 
      String nom = "";

      for (int i = 0; i < (equipo.length); i++) {

          nom += equipo[i] + ", ";
      }
      return nom;
  }
  
}

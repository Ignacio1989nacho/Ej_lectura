/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
    
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingresa una nota entre 0 y 10");
    int nota = leer.nextInt();
    
    while (nota < 0 || nota > 10){
    System.out.println("ingresa una nota entre 0 y 10:");
    nota = leer.nextInt();
    }
    
    System.out.println("La nota es "+nota);
    
    }
    
}

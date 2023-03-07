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



public class Ejercicio9 {
public static void main(String[] args){

Scanner leer = new Scanner(System.in);
int numeros ;
boolean comprobacion = false;
int cont = 0;
int cont2 = 0;


do{
    System.out.println("Ingresa 20 numeros:");
    numeros = leer.nextInt();

if (numeros > 0){
    cont = numeros + cont;
    
    
}
if (numeros == 0){
    comprobacion = true;
    System.out.println("Se capturo el numero 0");
    break;
}
   cont2 = cont2 + 1; 



}while(comprobacion == true || cont2 != 5 ); 
  System.out.println("la suma de los numeros ingresados es: "+cont);
  System.out.println("numeros capturados "+cont2);
 
  
  
}
        
}

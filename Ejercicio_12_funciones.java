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
public class Ejercicio_12_funciones {
    public static void main(String[] args){
    
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa dos numeros:");
    int num1 = leer.nextInt();
    int num2 = leer.nextInt();
    
    
    String mult = n(num1,num2);
    
        System.out.println(mult);
    
    
        
    }

public static String n(int num1,int num2){
    String n ="";
    
    if (num1 % num2 == 0){
    n = n.concat("el numero es multiplo");
    }else{
    n=n.concat("el numero no es multiplo");
            }
    return n;


}

    
}

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
public class Ejercicio11_subproceso {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa una palabra: ");

        String palabra = leer.nextLine();

        String retorno = p(palabra);
        
    
    System.out.println(retorno);
    }

    public static String p(String palabra) {

        String p="";
        
        for (int i = 0; i < palabra.length(); i++) {

            switch (palabra.substring(i, i+1)) {
                
                case "a":
                    p=p.concat("@");
                    break;

                case "e":
                    p+="#";
                    break;
                case "i":
                    p+="$";
                    break;
                case "o":
                    p+="%";
                    break;
                case "u":
                    p+="*";
                    break;
                default:
                    p+=(palabra.substring(i,i+1));
                    
            }
            
        }
        return p;
    }

}

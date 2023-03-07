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
public class ejercicio10_bucle_for {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int cont = 0;

        do {

            System.out.print("Escribe un numero:");

            int numeros = leer.nextInt();

            if (numeros > 0 && numeros < 20) {
                for (int i = 1; i == 1; i++) {

                    System.out.print(numeros + " ");

                    for (int j = 1; j <= numeros; j++) {
                        System.out.print("*");
                    }
                }
                
                System.out.println("");
                cont++;
            }
            
            
        } while (cont < 5);
    }
}

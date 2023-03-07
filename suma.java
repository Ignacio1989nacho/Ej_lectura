/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Usuario
 */
public class suma{
    public static void main (String[] args) {
        int numero1 = 10;
        int numero2 = 20;
        String palabra = "Estos son los resultados";

        double division = numero2 / numero1;

        boolean bandera = numero2 > numero1;

        int totalsuma = numero1 + numero2;
        int totalresta = numero1 - numero2;

        long multiplicacion = numero1 * numero2;
        
        System.out.print(palabra+" : ");
        System.out.print(division +": ");
        System.out.println(bandera);
        System.out.println(totalsuma);
        System.out.println(totalresta);
        System.out.println(multiplicacion);
        

    } 
}

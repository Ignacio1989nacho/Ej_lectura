package proyecto1;

import java.util.Scanner;


public class ingresarDatos {
    public static void main(String[] args){

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa tu nombre:");
        String nombre = leer.nextLine();

        System.out.println("Tu nombre es: " +nombre);

        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
        System.out.println("Tu edad es: "+edad);
        
    }
    
}
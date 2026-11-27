package Ejercicios_Bucles;

import java.util.Scanner;

public class Ejercicio13DarioRomeroRomero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int min = 1;
        int max = 100;
        int intentos = 0;
        char respuesta = ' ';

        System.out.println("Piensa un número del 1 al 100.");
        System.out.println("Usa: '>' si es mayor, '<' si es menor, '=' si he acertado.\n");

        // El bucle se repite mientras la respuesta NO sea '='
        while (respuesta != '=') {
            // Calculamos el punto medio del intervalo actual
            int intento = (min + max) / 2;
            intentos++;

            System.out.print("Intento " + intentos + " -> ¿Es el " + intento + "? (>, <, =): ");
            respuesta = teclado.next().charAt(0);

            // Evaluamos la respuesta del usuario
            if (respuesta == '>') {
                min = intento + 1; // El número está por encima
            } else if (respuesta == '<') {
                max = intento - 1; // El número está por debajo
            } else if (respuesta == '=') {
                System.out.println("\n¡Toma ya! Lo he adivinado en " + intentos + " intentos.");
            } else {
                System.out.println("Carácter no válido. Usa solo >, < o =.");
                intentos--;
            }
        }
    }
}

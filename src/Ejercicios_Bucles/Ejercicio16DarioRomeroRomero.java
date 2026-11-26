package Ejercicios_Bucles;

import java.util.Scanner;

/*
Escribe un programa que pida un número entero positivo y diga si es primo o no.
Para 13 debe decir que es primo.
 */
public class Ejercicio16DarioRomeroRomero {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero positivo: ");
        numero = sc.nextInt();

        if (numero <= 1) {
            System.out.println("El " + numero + " NO es primo.");
        } else {
            boolean esPrimo = true;

            for (int i = 2; i * i <= numero && esPrimo; i++) {
                if (numero % i == 0) {
                    esPrimo = false; // Activamos el interruptor si encontramos un divisor
                }
            }

            // Resultado final según el estado del interruptor
            if (esPrimo) {
                System.out.println("El " + numero + " SÍ es primo.");
            } else {
                System.out.println("El " + numero + " NO es primo.");
            }
        }
    }
}

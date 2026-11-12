/*
Escribe un programa que muestre por pantalla los 20 primeros números naturales: 1, 2, 3… 20.
 */
package Ejercicios_Bucles;

import java.util.Scanner;

public class Ejercicio1_Dario_Romero_Romero {
    public static void main(String[] args) {

        int numeros;
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos numeros quieres saber: ");
        numeros = sc.nextInt();

        for (int i = 0; i < numeros; i++) {
            System.out.printf("%d %n", i + 1);
        }

    }
}

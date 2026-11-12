/*
Escribe un programa que muestre los números pares comprendidos entre el 1 y el 200. Utiliza un contador y suma de 2 en 2.
 */
package Ejercicios_Bucles;

import java.util.Scanner;

public class Ejercicio2_Dario_Romero_Romero {
    public static void main(String[] args) {

        int numeros;
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos numeros quieres saber: ");
        numeros = sc.nextInt();

        for (int i = 0; i <= numeros; i += 2) {
            System.out.printf("%d %n", i);
        }

    }
}

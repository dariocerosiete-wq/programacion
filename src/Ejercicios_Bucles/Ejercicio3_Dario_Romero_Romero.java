/*
Escribe un programa que muestre los números pares comprendidos entre el 1 y el 200.
Esta vez utiliza un contador que suba de 1 en 1 y comprueba cada número.
 */
package Ejercicios_Bucles;

import java.util.Scanner;

public class Ejercicio3_Dario_Romero_Romero {
    public static void main(String[] args) {

        int numeros;
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos numeros quieres saber: ");
        numeros = sc.nextInt();

        for (int i = 0; i <= numeros; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }
}

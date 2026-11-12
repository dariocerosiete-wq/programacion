/*
Escribe un programa que muestre los números desde el 1 hasta un número N que se introduce por teclado
 */
package Ejercicios_Bucles;

import java.util.Scanner;

public class Ejercicio4_Dario_Romero_Romero {
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


/*
Escribe un programa que lea 10 números y después muestre un mensaje que diga si se ha introducido algún número negativo o no.
 */
package Ejercicios_Bucles;

import java.util.Scanner;

public class Ejercicio6_Dario_Romero_Romero {
    public static void main(String[] args) {

        boolean negativo = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 10 numeros: ");

        for (int i = 1; i <= 10; i++) {

            System.out.println("Numero: " + i + " ");
            int numero = sc.nextInt();

            if (numero < 0) {
                negativo = true;
            } else {
                negativo = false;
            }

            if (negativo == true) {
                System.out.println("Se ha detectado un negativo");
            } else {
                System.out.println("Positivo");
            }
        }
    }
}


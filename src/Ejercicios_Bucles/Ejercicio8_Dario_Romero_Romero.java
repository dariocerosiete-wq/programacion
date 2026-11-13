/*

 */
package Ejercicios_Bucles;

import java.util.Scanner;

public class Ejercicio8_Dario_Romero_Romero {
    public static void main(String[] args) {

        boolean negativo = false;
        Scanner sc = new Scanner(System.in);
        int contadorPosivos = 0, contadorNegativos = 0;

        System.out.println("Introduce 10 numeros: ");

        for (int i = 1; i <= 10; i++) {

            System.out.println("Numero: " + i + " ");
            int numero = sc.nextInt();

            if (numero < 0) {
                negativo = true;
                contadorNegativos += 1;
            } else {
                negativo = false;
                contadorPosivos += 1;
            }

            if (negativo == true) {
                System.out.println("Se ha detectado un negativo");
            }

        }
        System.out.println("Numero Positivos: " + contadorPosivos);
        System.out.println("Numero Negativos: " + contadorNegativos);
    }
}


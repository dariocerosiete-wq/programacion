package Ejercicios_Bucles;

import java.util.Scanner;

public class Ejercicio7_Dario_Romero_Romero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int contadorPosivos = 0, contadorNegativos = 0;

        System.out.println("Introduce 10 numeros: ");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Numero " + i + ": ");

            int numero = sc.nextInt();

            if (numero < 0) {
                contadorNegativos += 1;
            } else {
                contadorPosivos += 1;
            }
        }
        System.out.println("Numero de Negativos: " + contadorNegativos);
        System.out.println("Numero de Positivos: " + contadorPosivos);
    }
}


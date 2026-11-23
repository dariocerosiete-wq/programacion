package Ejercicios_Arrays;
/*
Escribe un programa que pida veinte números enteros,
los guarde en un vector y muestre por separado la suma de los positivos y la de los negativos.
 */

import java.util.Scanner;

public class Ejercicio_4_Dario_Romero_Romero {
    public static void main(String[] args) {

        double notas[] = new double[20];
        Scanner sc = new Scanner(System.in);

        double valores = 0;
        for (int i = 1; i <= notas.length; i++) {
            System.out.print("Introduzca su nota " + i + ": " + " ");
            valores = sc.nextDouble();
            notas[i - 1] = valores;
        }

        int j;
        double sumaPositivos = 0, sumaNegativos = 0;
        for (j = 0; j < notas.length; j++) {
            if (notas[j] < 0) {
                sumaNegativos += notas[j];
            }
            if (notas[j] > 0) {
                sumaPositivos += notas[j];
            }
        }
        System.out.println();
        System.out.printf("La suma de los negativos: %.2f %n", sumaNegativos);
        System.out.printf("La suma de los positivos: %.2f ", sumaPositivos);
    }
}

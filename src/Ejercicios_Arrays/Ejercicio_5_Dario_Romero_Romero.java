package Ejercicios_Arrays;

import java.util.Scanner;

/*
Escribe un programa que pida veinte números reales, los guarde en un vector y
calcule y muestre su media: la suma de los valores dividida entre el número de valores
 */

public class Ejercicio_5_Dario_Romero_Romero {
    public static void main(String[] args) {

        double notas[] = new double[20];
        Scanner sc = new Scanner(System.in);

        double valores = 0;
        double suma = 0;
        double media = 0;
        for (int i = 1; i <= notas.length; i++) {
            System.out.print("Introduzca su nota " + i + ": " + " ");
            valores = sc.nextDouble();
            notas[i - 1] = valores;
        }

        for (int j = 0; j < notas.length; j++) {
            suma += notas[j];
            media = suma / notas.length;
        }

        System.out.println();
        System.out.printf("La suma de las notas es: %.2f %n ", suma);
        System.out.printf("La media de la suma de las notas es: %.2f ", media);
    }
}



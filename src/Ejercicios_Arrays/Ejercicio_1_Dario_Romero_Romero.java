package Ejercicios_Arrays;

import java.util.Scanner;

/*
Escribe un programa que pida diez números reales por teclado, los guarde en un vector y después muestre todos sus valores.
 */
public class Ejercicio_1_Dario_Romero_Romero {
    public static void main(String[] args) {

        double notas[] = new double[10];
        Scanner sc = new Scanner(System.in);

        double valores = 0;
        for (int i = 1; i <= notas.length; i++) {
            System.out.print("Introduzca su nota " + i + ": " + " ");
            valores = sc.nextDouble();
            notas[i - 1] = valores;
        }

        System.out.print("Las notas son: ");
        for (int j = 0; j < notas.length; j++) {
            System.out.print(" " + notas[j] + " ");
        }
    }
}

package Ejercicios_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Escribe un programa que guarde en un vector una secuencia aritmética y la muestre.
Una secuencia aritmética empieza en un valor inicial V y avanza con incrementos de I: con V = 1 e I = 2,
la secuencia es 1, 3, 5, 7, 9…; con V = 7 e I = 10, es 7, 17, 27, 37… El programa pide V, I y N, el número de valores.
 */
public class Ejercicio_13_Dario_Romero_Romero {
    static void main(String[] args) {
        int v, incremento, n;
        Scanner sc = new Scanner(System.in);

        System.out.print("El numero de valores que quiera que tenga: ");
        n = sc.nextInt();

        int vector[] = new int[n];

        System.out.print("Por el valor que quiere que empieze tu vector: ");
        v = sc.nextInt();

        System.out.print("Cuanto quieres ir incrementandole (ejemplo de 7 en 7): ");
        incremento = sc.nextInt();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = v + (i * incremento);
        }
        System.out.println();
        System.out.print("Secuencia " + Arrays.toString(vector));
    }
}

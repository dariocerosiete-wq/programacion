package Ejercicios_Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
Escribe un programa que cree un vector de enteros
con esta secuencia: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5… hasta el 10 repetido diez veces, y la muestre.
 */
public class Ejercicio_14_Dario_Romero_Romero {
    public static void main(String[] args) {

        int tamaño = 0;

        for (int i = 1; i <= 10; i++) {
            tamaño += i;
        }

        int vector[] = new int[tamaño];

        int indice = 0;
        for (int numero = 1; numero <= 10; numero++) {
            for (int repeticion = 0; repeticion < numero; repeticion++) {
                vector[indice] = numero;
                indice++;
            }
        }
        System.out.println("Tamaño calculado: " + tamaño);
        System.out.println("Secuencia: " + Arrays.toString(vector));
    }
}

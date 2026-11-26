package Ejercicios_Arrays;

import java.util.Scanner;

/*
Escribe un programa que pida dos enteros, N y M, cree un vector de tamaño N,
 escriba M en todas sus posiciones y lo muestre
 */
public class Ejercicio_6_Dario_Romero_Romero {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);

        System.out.print("Intruduzca el tamaño del array: ");
        n = sc.nextInt();

        System.out.print("Intruduzca las posiciones del array: ");
        m = sc.nextInt();

        // Creando el array con lo que me ha dicho el usuario
        int[] vector = new int[n];

        //Los valores del array
        System.out.print("Contenido del vector: ");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = m;
            System.out.print(vector[i] + " ");
        }
    }
}

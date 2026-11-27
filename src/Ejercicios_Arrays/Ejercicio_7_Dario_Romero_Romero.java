package Ejercicios_Arrays;

import java.util.Scanner;

public class Ejercicio_7_Dario_Romero_Romero {
    public static void main(String[] args) {

        int vector[];
        Scanner sc = new Scanner(System.in);
        int p, q;

        System.out.print("Introduce el tamaño del vector: ");
        p = sc.nextInt();

        System.out.print("Introduce los valores del vector: ");
        q = sc.nextInt();

        if (q < p) {
            System.out.println("Error: Q debe ser mayor o igual que P.");
            System.exit(0);
        } else {
            // Calcular tamaño e instanciar el vector
            int tamano = q - p + 1;
            vector = new int[tamano];

            // Rellenar el vector desde P hasta Q
            for (int i = 0; i < vector.length; i++) {
                vector[i] = p + i;
            }

            // Mostrar el contenido del vector
            System.out.print("Valores del vector: ");
            for (int i = 0; i < vector.length; i++) {
                System.out.print(vector[i] + " ");
            }
        }

    }
}

package Ejercicios_Arrays;

import java.util.Arrays;

public class Ejercicio_11_Dario_Romero_Romero {
    public static void main(String[] args) {
        // 1. Crear dos vectores de 100 enteros
        int[] original = new int[100];
        int[] inverso = new int[100];

        // 2. Llenar el primero con los valores del 1 al 100
        for (int i = 0; i < original.length; i++) {
            original[i] = i + 1;
        }

        // Restauramos el espacio en memoria para 'inverso' antes de hacer la copia real
        inverso = new int[100];

        // 3. Copiar los valores de 'original' en 'inverso' en orden inverso
        for (int i = 0; i < original.length; i++) {
            // Expresión clave usando .length en lugar de 99
            inverso[original.length - 1 - i] = original[i];
        }

        // 4. Mostrar ambos vectores finales
        System.out.println("\n--- Orden Original y Inverso ---");
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Inverso:  " + Arrays.toString(inverso));
    }
}


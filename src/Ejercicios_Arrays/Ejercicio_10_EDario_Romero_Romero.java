package Ejercicios_Arrays;

import java.util.Scanner;

/*
Escribe un programa para hacer cálculos con las alturas, en metros, de un grupo de personas.
Pedirá un valor N y guardará en un vector N alturas tecleadas por el usuario. Después mostrará la altura media,
la máxima y la mínima, y cuántas personas miden por encima y por debajo de la media.
 */
public class Ejercicio_10_EDario_Romero_Romero {
    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);


        System.out.print("Introduce el número de personas (N): ");
        n = sc.nextInt();

        // Validar que N sea mayor que 0
        if (n <= 0) {
            System.out.println("El número de personas debe ser mayor que cero.");
            return;
        }

        //Crear el vector y pedir las N alturas
        double[] alturas = new double[n];
        double suma = 0;

        System.out.println("\nIntroduce las alturas en metros (por ejemplo, 1,75 o 1.75):");
        for (int i = 0; i < n; i++) {
            System.out.print("Altura de la persona " + (i + 1) + ": ");
            alturas[i] = sc.nextDouble();
            suma += alturas[i];
        }

        //Calcular la altura media
        double media = suma / n;

        //Calcular la altura máxima y mínima
        double maxima = alturas[0];
        double minima = alturas[0];

        for (int i = 1; i < n; i++) {
            if (alturas[i] > maxima) {
                maxima = alturas[i];
            }
            if (alturas[i] < minima) {
                minima = alturas[i];
            }
        }

        //Contar cuántas personas miden por encima y por debajo de la media
        int encimaMedia = 0;
        int debajoMedia = 0;

        for (int i = 0; i < n; i++) {
            if (alturas[i] > media) {
                encimaMedia++;
            } else if (alturas[i] < media) {
                debajoMedia++;
            }
        }

        //Mostrar los resultados
        System.out.println("\n--- Resultados ---");
        System.out.printf("Altura media: %.2f m%n", media);
        System.out.printf("Altura máxima: %.2f m%n", maxima);
        System.out.printf("Altura mínima: %.2f m%n", minima);
        System.out.println("Personas por encima de la media: " + encimaMedia);
        System.out.println("Personas por debajo de la media: " + debajoMedia);

    }
}


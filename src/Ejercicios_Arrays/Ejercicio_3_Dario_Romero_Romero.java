package Ejercicios_Arrays;

import java.util.Scanner;

/*
Escribe un programa que pida diez números reales por teclado, los guarde en un vector y lo recorra
para encontrar el máximo y el mínimo,
que mostrará por pantalla.
 */
public class Ejercicio_3_Dario_Romero_Romero {
    public static void main(String[] args) {

        double notas[] = new double[10];
        Scanner sc = new Scanner(System.in);

        double valores = 0;
        for (int i = 1; i <= notas.length; i++) {
            System.out.print("Introduzca su nota " + i + ": " + " ");
            valores = sc.nextDouble();
            notas[i - 1] = valores;
        }

        int j;
        double maximo = notas[0];
        double minimo = notas[0];

        for (j = 0; j < notas.length; j++) {
            maximo = Math.max(notas[j], maximo);
            minimo = Math.min(notas[j], minimo);
        }

        System.out.println();
        System.out.printf("El numero minimo es: %.2f %n", minimo);
        System.out.printf("El numero maximo es: %.2f ", maximo);
    }
}

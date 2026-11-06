package Ejercicios;

import java.util.Scanner;

public class Ejercicio12_Dario_Romero_Romero {
    public static void main(String[] args) {
        final double EPSILON = 1e-9;   // tolerancia para comparar reales
        Scanner entrada = new Scanner(System.in);
        double a, b, c, mayor, menor, mediano;

        System.out.print("Lado a: ");
        a = entrada.nextDouble();
        System.out.print("Lado b: ");
        b = entrada.nextDouble();
        System.out.print("Lado c: ");
        c = entrada.nextDouble();

        if (a <= 0 || b <= 0 || c <= 0 || a >= b + c || b >= a + c || c >= a + b) {
            System.out.println("No forman un triángulo");
        } else {
            if (a == b && b == c) {
                System.out.println("Es equilátero");
            } else if (a == b || b == c || a == c) {
                System.out.println("Es isósceles");
            } else {
                System.out.println("Es escaleno");
            }

            // El mediano es lo que queda al quitar el mayor y el menor
            mayor = Math.max(a, Math.max(b, c));
            menor = Math.min(a, Math.min(b, c));
            mediano = a + b + c - mayor - menor;
            if (Math.abs(menor * menor + mediano * mediano - mayor * mayor)
                    < EPSILON) {
                System.out.println("Es rectángulo");
            } else {
                System.out.println("No es rectángulo");
            }
        }
    }
}


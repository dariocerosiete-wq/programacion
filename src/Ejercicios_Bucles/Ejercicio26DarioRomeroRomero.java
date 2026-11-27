package Ejercicios_Bucles;

import java.util.Scanner;

public class Ejercicio26DarioRomeroRomero {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int n, limite, suma;

            // Parte 1: divisores de un número
            do {
                System.out.print("Número mayor que 0: ");
                n = entrada.nextInt();
            } while (n <= 0);

            System.out.print("Divisores de " + n + ":");
            suma = 0;
            for (int d = 1; d < n; d++) {
                if (n % d == 0) {
                    System.out.print(" " + d);
                    suma += d;
                }
            }
            System.out.println();
            if (suma == n) {
                System.out.println(n + " es perfecto");
            } else {
                System.out.println(n + " no es perfecto");
            }

            // Parte 2: todos los perfectos hasta un límite
            System.out.print("Buscar perfectos hasta: ");
            limite = entrada.nextInt();
            System.out.print("Perfectos hasta " + limite + ":");
            for (int candidato = 2; candidato <= limite; candidato++) {
                suma = 0;
                for (int d = 1; d < candidato; d++) {
                    if (candidato % d == 0) {
                        suma += d;
                    }
                }
                if (suma == candidato) {
                    System.out.print(" " + candidato);
                }
            }
            System.out.println();
        }
    }

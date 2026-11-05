package Ejercicios;

import java.util.Scanner;

public class Ejercicio8_Dario_Romero_Romero {

    public static void main(String[] args) {

        double nota;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu calificación: ");
        nota = sc.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota no válida");
        } else if (nota < 3) {
            System.out.println("Muy deficiente");
        } else if (nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota < 6) {
            System.out.println("Bien");
        } else if ( nota< 9) {
            System.out.println("Notable");
        } else if (nota <= 10) {
            System.out.println("Sobresaliente");
        }
    }
}

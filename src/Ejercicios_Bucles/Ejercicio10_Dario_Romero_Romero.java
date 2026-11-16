/*
Escribe un programa que lea una secuencia de notas, con valores de 0 a 10,
que termina con el valor −1, y diga si hubo o no alguna nota con valor 10.
 */
package Ejercicios_Bucles;

import java.util.Scanner;

public class Ejercicio10_Dario_Romero_Romero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double nota;
        boolean hubo10 = false;

        System.out.print("Ingrese su nota: ");
        nota = sc.nextDouble();

        while (nota != -1) {
            if (nota == 10) {
                hubo10 = true;
            }
            System.out.print("Ingrese otra nota (parar -1): ");
            nota = sc.nextDouble();
        }
        if (hubo10) {
            System.out.println("Si, hubo algun 10");
        } else {
            System.out.println("No, no hubo algun 10");
        }
    }
}

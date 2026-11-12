/*
Escribe un programa que lea un número entero positivo N y calcule y muestre su factorial,
N!, sabiendo que 0! = 1, 1! = 1, 2! = 2 · 1, 3! = 3 · 2 · 1, y en general N! = N · (N − 1) · (N − 2) · … · 2 · 1.
 */
package Ejercicios_Bucles;

import java.util.Scanner;

public class Ejercicio5_Dario_Romero_Romero {
    static void main(String[] args) {
        int numero;
        int factorial = numero;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero: ");
        numero = sc.nextInt();

        for (int i = 0; i <= numero; i++) {
            System.out.println(factorial = numero * (numero-i));
        }
        System.out.printf("El factorial de: %d ",factorial);
    }
}

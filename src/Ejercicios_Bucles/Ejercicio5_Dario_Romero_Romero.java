/*
Escribe un programa que lea un número entero positivo N y calcule y muestre su factorial,
N!, sabiendo que 0! = 1, 1! = 1, 2! = 2 · 1, 3! = 3 · 2 · 1, y en general N! = N · (N − 1) · (N − 2) · … · 2 · 1.
 */
package Ejercicios_Bucles;

import java.util.Scanner;

public class Ejercicio5_Dario_Romero_Romero {
    static void main(String[] args) {
        int numero, resultadoo = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero: ");
        numero = sc.nextInt();


        if (numero < 0) {
            System.exit(0);
        }

        do {
            resultadoo = resultadoo * numero;
            numero = numero - 1;
        } while (numero >= 1);

        System.out.println("El factorial es: " + resultadoo);
    }
}

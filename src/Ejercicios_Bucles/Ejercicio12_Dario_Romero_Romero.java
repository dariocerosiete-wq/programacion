/*
Escribe un programa que calcule A elevado a B sin usar Math.pow,
siendo A un número real y B un entero introducidos por teclado, y muestre el resultado.
 */
package Ejercicios_Bucles;

import java.util.Scanner;

public class Ejercicio12_Dario_Romero_Romero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double base, resultado = 1.0;
        int exponente, expAbsoluto;

        System.out.print("Introduce la base (A, número real): ");
        base = sc.nextDouble();

        System.out.print("Introduce el exponente (B, número entero): ");
        exponente = sc.nextInt();


        // Si el exponente es negativo, convertimos la base a su inversa y hacemos el exponente positivo
        expAbsoluto = Math.abs(exponente);

        for (int i = 0; i < expAbsoluto; i++) {
            resultado *= base;
        }

        if (exponente < 0) {
            if (base == 0) {
                System.out.println("Error: No se puede elevar 0 a un exponente negativo.");
                return;
            }
            resultado = 1.0 / resultado;
        }

        // Mostrar el resultado
        System.out.println(base + " elevado a " + exponente + " es: " + resultado);
    }
}

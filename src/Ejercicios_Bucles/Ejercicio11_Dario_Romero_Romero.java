/*
Escribe un programa que sume por separado los números pares y los impares comprendidos entre 100 y 200, y muestre las dos sumas.
 */
package Ejercicios_Bucles;

public class Ejercicio11_Dario_Romero_Romero {
    public static void main(String[] args) {

        int sumarPares = 0, sumarImpares = 0;

        for (int i = 100; i <= 200; i++) {
            if (i % 2 == 0) {
                sumarPares += i;
            } else {
                sumarImpares += i;
            }
        }
        System.out.println("Suma Pares: " + sumarPares);
        System.out.println("Suma Impares: " + sumarImpares);
    }
}

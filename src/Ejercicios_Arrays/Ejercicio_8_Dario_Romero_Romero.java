package Ejercicios_Arrays;

import java.util.Scanner;

/*
Escribe un programa que cree un vector con 100 números reales aleatorios entre 0,0 y 1,0,
usando Math.random(),
pida al usuario un real R y muestre cuántos valores del vector son iguales o mayores que R.
 */
public class Ejercicio_8_Dario_Romero_Romero {
    public static void main(String[] args) {
        double[] vector = new double[100];
        double r;
        Scanner sc = new Scanner(System.in);

        //Rellenar el vector con 100 numeros
        for (int i = 0; i < vector.length; i++) {
            vector[i] = Math.random();
        }

        //Pidiendo al usuario el numero real
        System.out.print("Introduce un número real R (entre 0,0 y 1,0): ");
        r = sc.nextDouble();

        //Contar los valores si hay igual o mayores que r
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] >= r) {
                contador++;
            }
        }

        System.out.println("Hay " + contador + " valores iguales o mayores que " + r + ".");
    }
}

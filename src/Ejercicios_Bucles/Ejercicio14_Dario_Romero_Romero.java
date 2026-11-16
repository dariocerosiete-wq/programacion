/*
Escribe un programa que, dada una cantidad de euros introducida por teclado y múltiplo de 5, muestre los billetes de
cada tipo necesarios para alcanzarla usando billetes de 500, 200, 100, 50, 20, 10 y 5 €, con el mínimo número de billetes.
Por ejemplo, para 145 € el programa indicará 1 billete de 100, 2 billetes de 20 y 1 billete de 5; no vale 29 billetes de 5.
 */
package Ejercicios_Bucles;

import java.util.Scanner;

public class Ejercicio14_Dario_Romero_Romero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = 500, cantidad, nBilletes;

        System.out.print("Escribe la cantidad de dinero: ");
        cantidad = sc.nextInt();

        while (cantidad >= 5) {
            nBilletes = (cantidad / n);
            cantidad = cantidad % n;

            System.out.println("Billetes de " + n + " = " + nBilletes);

            switch (n) {
                case 500:
                    n = 200;
                    break;
                case 200:
                    n = 100;
                    break;
                case 100:
                    n = 50;
                    break;
                case 50:
                    n = 20;
                    break;
                case 20:
                    n = 10;
                    break;
                case 10:
                    n = 5;
                    break;
            }
        }
    }
}

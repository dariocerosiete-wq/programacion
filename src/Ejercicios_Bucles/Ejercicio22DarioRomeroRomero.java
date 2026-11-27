package Ejercicios_Bucles;

import java.util.Scanner;

/*
Escribe un programa que pida un número y construya por pantalla una pirámide de asteriscos con
tantas filas como indica. Para 6:

     *
    ***
   *****
  *******
 *********
***********
 */
public class Ejercicio22DarioRomeroRomero {
    public static void main(String[] args) {
        int numero;
        char asterisco = '*';
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero para crear la piramide: ");
        numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {

            // 1. Pintar los espacios (van disminuyendo: 5, 4, 3, 2, 1, 0)
            for (int j = 1; j <= (numero - i); j++) {
                System.out.print(" ");
            }

            // 2. Pintar los asteriscos (en cada fila ponemos el doble de i menos 1)
            // Si prefieres verlo con una variable acumulada:

            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print(asterisco);
            }

            // 3. Salto de línea para pasar a la siguiente fila
            System.out.println();
        }
    }
}

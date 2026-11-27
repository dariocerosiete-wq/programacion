package Ejercicios_Bucles;

import java.util.Scanner;

/*
Escribe un programa que lea un número y escriba el carácter * tantas veces como indica el número.
Si el número no es positivo, escribirá un único asterisco.
Para 8 debe mostrar ********.
 */
public class Ejercicio19DarioRomeroRomero {
    public static void main(String[] args) {
        int numero;
        char asterisco = '*';
        int contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe el numero (Si es negativo se escribe un * nada más): ");
        numero = sc.nextInt();

        do {
            System.out.print(asterisco);
            contador++;
        } while (contador < numero);
    }
}

package Ejercicios_Bucles;
/*
Escribe un programa que lea un número entero y muestre cuántas cifras tiene, cuánto suman y
cómo se escribe al revés. Para 4702 debe decir 4 cifras, suma 13 y al revés 2074. Hazlo con aritmética,
usando / 10 y % 10 para ir separando las cifras, sin convertir el número a texto.
 */
import java.util.Scanner;

public class Ejercicio29DarioRomeroRomero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, resto, cifras = 0, suma = 0, invertido = 0;

        System.out.print("Número entero: ");
        n = sc.nextInt();
        resto = Math.abs(n);

        do {
            int cifra = resto % 10;
            cifras++;
            suma += cifra;
            invertido = invertido * 10 + cifra;
            resto = resto / 10;
        } while (resto > 0);

        System.out.println("Cifras: " + cifras);
        System.out.println("Suma de las cifras: " + suma);
        System.out.println("Al revés: " + invertido);
    }
}


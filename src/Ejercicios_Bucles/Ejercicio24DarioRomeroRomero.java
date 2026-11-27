package Ejercicios_Bucles;

import java.util.Scanner;

//Encuentra los errores logicos
public class Ejercicio24DarioRomeroRomero {
    //Codigo que hay quie corregir

    /* public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero, cuantos = 0;
        double suma = 0;

        System.out.print("Número (0 para terminar): ");
        numero = entrada.nextInt();
        while (numero != 0)
        {
            if (numero > 0) {
                suma += numero;
            }
            cuantos++;
        }
        System.out.printf("Media de los positivos: %.2f%n", suma / cuantos);
    }
    */

    //Codigo corregido
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cuantos = 0;
        double suma = 0;

        System.out.print("Número (0 para terminar): ");
        while (!entrada.hasNextInt()) {
            entrada.next();
            System.out.print("Eso no es un número. Número (0 para terminar): ");
        }
        numero = entrada.nextInt();

        while (numero != 0) {
            if (numero > 0) {
                suma += numero;
                cuantos++;
            }
            System.out.print("Número (0 para terminar): ");
            while (!entrada.hasNextInt()) {
                entrada.next();
                System.out.print("Eso no es un número. Número (0 para terminar): ");
            }
            numero = entrada.nextInt();
        }

        if (cuantos > 0) {
            System.out.printf("Media de los positivos: %.2f%n", suma / cuantos);
        } else {
            System.out.println("No se ha introducido ningún positivo");
        }
    }
}


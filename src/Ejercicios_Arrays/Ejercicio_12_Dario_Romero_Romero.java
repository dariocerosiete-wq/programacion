package Ejercicios_Arrays;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

/*
Escribe un programa que cree un vector de 10 enteros y muestre este menú:

a. Mostrar valores
b. Introducir valor
c. Salir

La opción a muestra todos los valores. La opción b pide un valor V
y una posición P y escribe V en la posición P del vector. El menú se repite hasta que el usuario elige c.
 */
public class Ejercicio_12_Dario_Romero_Romero {
    static void main(String[] args) {
        int vector[] = new int[10];
        int v, p;
        Scanner sc = new Scanner(System.in);
        char opcion;

        do {
            System.out.println("=============================");
            System.out.println("MENU:");
            System.out.println("a. Mostrar Valores");
            System.out.println("b. Introducir el valor");
            System.out.println("c. Salir");
            System.out.println("=============================");
            System.out.print("Introduzca su opcion: ");
            opcion = Character.toLowerCase(sc.next().charAt(0));

            switch (opcion) {
                case 'a':
                    System.out.println("Valores del vector: ");
                    for (int i = 0; i < vector.length; i++) {
                        System.out.println("Posicion " + i + ": " + vector[i]);
                    }
                    break;
                case 'b':
                    System.out.print("Introduce el valor V: ");
                    v = sc.nextInt();

                    System.out.print("Introduce la posicion P: ");
                    p = sc.nextInt();

                    if (p >= 0 && p < vector.length) {
                        vector[p] = v;
                        System.out.println("Valor guardado correctamente");

                    } else {
                        System.out.println("ERROR: La posicion no existe en el vector");
                    }
                    break;

                case 'c':
                    System.out.println("Saliendo del programa....");
                    break;
                default:
                    System.out.println("Opcion no valida tiene que ser a,b,c");
                    break;
            }

        } while (!(opcion == 'c'));
    }
}



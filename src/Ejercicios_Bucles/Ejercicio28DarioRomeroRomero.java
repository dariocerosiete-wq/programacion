package Ejercicios_Bucles;
/*
Escribe un programa que muestre las tablas de multiplicar del 1 al 10 en una cuadrícula,
con una fila por tabla, una columna por multiplicador y una cabecera, todo alineado:
 */
public class Ejercicio28DarioRomeroRomero {
    public static void main(String[] args) {
        final int ULTIMA = 10;

        // Cabecera
        System.out.print("  x |");
        for (int j = 1; j <= ULTIMA; j++) {
            System.out.printf("%4d", j);
        }
        System.out.println();
        System.out.print("----+");
        for (int j = 1; j <= ULTIMA; j++) {
            System.out.print("----");
        }
        System.out.println();

        // Una fila por tabla
        for (int i = 1; i <= ULTIMA; i++) {
            System.out.printf("%3d |", i);
            for (int j = 1; j <= ULTIMA; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}


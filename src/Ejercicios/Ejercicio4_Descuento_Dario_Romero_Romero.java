package Ejercicios;

import java.util.Scanner;

public class Ejercicio4_Descuento_Dario_Romero_Romero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double precioArticulo, precioOriginal, descuento;

        System.out.print("Introduce el precio real: ");
        precioOriginal = sc.nextDouble();

        System.out.print("Introduce el precio del articulo: ");
        precioArticulo = sc.nextDouble();

        descuento = ((precioOriginal - precioArticulo) / precioOriginal) * 100;
        System.out.printf("El descuento es: %.2f %% ",  descuento);
    }
}

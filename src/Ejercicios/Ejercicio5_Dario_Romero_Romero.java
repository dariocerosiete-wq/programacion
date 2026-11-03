package Ejercicios;

import java.util.Scanner;

public class Ejercicio5_Dario_Romero_Romero {
    public static void main(String[] args) {
        final double UNA_MILLA = 1852.0;
        double numeroMillas, metros;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la milla que quiera para calcular a metros: ");
        numeroMillas = sc.nextDouble();

        metros = numeroMillas * UNA_MILLA;

        System.out.printf("%.2f millas marinas son %.2f metros",  numeroMillas, metros);

    }
}

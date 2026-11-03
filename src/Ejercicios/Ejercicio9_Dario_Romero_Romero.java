package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9_Dario_Romero_Romero {
    public static void main(String[] args) {
        int hora, minuto, segundos;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la hora actual");

        System.out.print("Introduzca la hora: ");
        hora = sc.nextInt();

        System.out.print("Introduzca los minutos: ");
        minuto = sc.nextInt();

        System.out.print("Introduzca los segundos: ");
        segundos = sc.nextInt();

        segundos++;

        if (segundos > 59) {
            segundos = 0;
            minuto++;

        }
        if (minuto > 59) {
            minuto = 0;
            hora++;
        }

        if (hora > 23) {
            hora = 0;
        }

        System.out.printf("Un segundo después son las %02d:%02d:%02d%n ", hora, minuto, segundos);
    }
}

package Ejercicios;

import java.util.Scanner;

public class Ejercicio13_DarioRomeroRomero {
    public static void main(String[] args) {
        int numeroDNI;
        char letraDNI;
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe tu número del DNI: ");
        numeroDNI = sc.nextInt();

        System.out.print("Escribe una letra: ");
        letraDNI = sc.next().charAt(0);

        int resto = numeroDNI % 23;
        String  letra1 = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resultado = letra1.charAt(resto);

    }
}

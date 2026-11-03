package Ejercicios;

import java.util.Scanner;

public class Ejercicio6_Dario_Romero_Romero {
    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad para comprobar si eres mayor o menor: ");
        edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de  edad");
        }
    }
}

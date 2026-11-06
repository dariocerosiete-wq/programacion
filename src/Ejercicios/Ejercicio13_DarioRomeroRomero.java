package Ejercicios;

import java.util.Scanner;

public class Ejercicio13_DarioRomeroRomero {
    public static void main(String[] args) {
        int numeroDNI;
        char letraDNI;
        Scanner sc = new Scanner(System.in);

        //Leyendo el numero del dni
        System.out.print("Escribe tu número del DNI: ");
        numeroDNI = sc.nextInt();
        //Leyendo la letra del DNI
        System.out.print("Escribe una letra: ");
        letraDNI = Character.toUpperCase(sc.next().charAt(0));

        //Sacando el resto del DNI y diciendo en que posicion está la letra de ese número
        int resto = numeroDNI % 23;
        String letrasValidadas = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letraCalculada = letrasValidadas.charAt(resto);

        //La validacion de sí está la letra en ese rango del String letrasValidadas
        if (letraDNI == letraCalculada) {
            System.out.println("La letra del DNI es correcta.");
        } else {
            System.out.println("La letra es incorrecta. La letra que debería llevar es: " + letraCalculada);
        }
    }
}

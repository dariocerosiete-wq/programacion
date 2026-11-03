package Ejercicios;

import java.util.Scanner;

public class Ejercicio3_Dario_Romero_Romero {
    public static void main(String[] args) {
        double radio;

        Scanner sc = new Scanner(System.in);

        System.out.print("Mete el radio del circulo: ");
        radio = sc.nextDouble();

        //Resultado
        System.out.println("Longitud de la circunferencia: " + (2 * Math.PI * radio));
        System.out.println("Área del círculo: " + (Math.PI * Math.pow(radio, 2)));
        System.out.println("Volumen de la esfera: " + ((double) 4 / 3) * Math.PI * Math.pow(radio, 3));

    }
}


package Ejercicios;

import java.util.Scanner;

public class Ejercicio2_Dario_Romero_Romero {
    public static void main(String[] args) {

        //Variables
        double ladoCorto;
        double ladoLargo;
        Scanner sc = new Scanner(System.in);

        //lee el primer lado
        System.out.print("Escribe el primer lado el corto del cuadrado: ");
        ladoCorto = sc.nextDouble();

        //lee el segundo lado
        System.out.print("Escribe el segundo lado el lado largo del cuadrado: ");
        ladoLargo = sc.nextDouble();

        //operacion
        double areaCuadrado = ladoCorto * ladoLargo;

        //Resultado
        System.out.println("El area del cuadrado es: " + areaCuadrado);

    }
}

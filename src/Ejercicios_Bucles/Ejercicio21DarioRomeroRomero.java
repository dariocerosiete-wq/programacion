package Ejercicios_Bucles;

import java.util.Scanner;

/*
Escribe un programa que pida dos números enteros A y B, con B mayor que A,
muestre los números desde A hasta B e indique cuántos de ellos son pares.
Para 5 y 11 debe mostrar 5 6 7 8 9 10 11 y decir que hay 3 pares.
 */
public class Ejercicio21DarioRomeroRomero {
    public static void main(String[] args) {
        int a, b, contadorPares = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el valor A: ");
        a = sc.nextInt();

        System.out.print("Introduzca el valor B: ");
        b = sc.nextInt();

        if (a > b){
            System.out.println("El valor tiene que ser menor que " + a);
            System.exit(0);
        }else{
            //Si los numeros fuesen negativos tienes que poner el numero menor primero por ejemplo el -11 y el -5
            //porque el -11 es más chico que el -5, se imprimiria alreves pero el contador pares funciona igualmente
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    contadorPares++;
                }
                System.out.println(i);

            }
        }
        System.out.println("Numero de pares: " + contadorPares);
    }
}

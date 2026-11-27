package Ejercicios_Bucles;

import java.util.Scanner;

/*
Escribe un programa que muestre y cuente los múltiplos de 3 desde el 1
hasta un número que se introduce por teclado. Para 13 debe decir que hay 4.
 */
public class Ejercicio_15_Dario_Romero_Romero {
    public static void main (String[] args) {
        int limite, contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el numero maximo para identificar los multiplos de tres: ");
        limite = sc.nextInt();
        for (int i = 1; i <=limite ; i++) {
            if(i%3==0){
                contador++;
            }
        }
        System.out.println("\nPara " + limite + " hay " + contador + " múltiplos de 3.");
    }
}

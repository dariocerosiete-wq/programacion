/*
Escribe un programa que calcule y muestre la suma y el producto de los 10 primeros números naturales.
 */
package Ejercicios_Bucles;

public class Ejercicio9_Dario_Romero_Romero {
    public static void main(String[] args) {
        int suma = 0, producto = 1;

        for (int i = 1; i <= 10; i++) {
            suma = suma + i;
            producto = producto * i;
        }

        //Comprobacion suma n · (n + 1) / 2
        System.out.println("Resultado suma: " + suma);
        System.out.println("Resultado producto: " + producto);
    }
}

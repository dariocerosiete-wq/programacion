package Ejercicios;

import java.util.Scanner;

public class Ejercicio7_Dario_Romero_Romero {
    public static void main(String[] args) {

        int numero1, numero2, numero3, menor, maximo, medio;
        String resultado = "Ordenación de menor a mayor:";


        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        numero1 = sc.nextInt();

        System.out.print("Introduce el segundo numero: ");
        numero2 = sc.nextInt();

        System.out.print("Introduce el tercer numero: ");
        numero3 = sc.nextInt();


        menor = Math.min(numero1, Math.min(numero2, numero3));
        maximo = Math.max(numero1, Math.max(numero2, numero3));
        medio = (numero1 + numero2 + numero3) - menor - maximo;

        System.out.println(resultado + " " + menor + " " + medio + " " + maximo);
    }
}

package Ejercicios;

import java.util.Scanner;

public class Ejercicio11_Dario_Romero_Romero {
    public static void main(String[] args) {

        double a, b, c, discriminante, resultado1 = 0, resultado2 = 0;
        int caso = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número de la ecuación: ");
        a = sc.nextDouble();
        System.out.print("Introduce el segundo número de la ecuación: ");
        b = sc.nextDouble();
        System.out.print("Introduce el tercer número de la ecuación: ");
        c = sc.nextDouble();

        discriminante = Math.pow(b, 2) - (4 * a * c);

        if (a != 0 && discriminante > 0) {
            caso = 1;
            resultado1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            resultado2 = (-b - Math.sqrt(discriminante)) / (2 * a);
        }
        if (a != 0 && discriminante == 0) {
            caso = 2;
            resultado1 = resultado2 = -b / (2 * a);
        }
        if (a != 0 && discriminante < 0) {
            caso = 3;
        }
        if (a == 0 && b != 0) {
            caso = 4;
            resultado1 = -c / b;
        }
        if (a == 0 && b == 0 && c != 0) {
            caso = 5;
        }
        if (a == 0 && b == 0 && c == 0) {
            caso = 6;
        }
        switch (caso) {
            case 1 -> System.out.printf("Dos soluciones: x1= %.2f y x2= %.2f", resultado1, resultado2);
            case 2 -> System.out.printf("El resultado es doble = %.2f", resultado1);
            case 3 -> System.out.printf("No tiene soluciones reales");
            case 4 -> System.out.printf("Es de primer grado: x= %.2f", resultado1);
            case 5 -> System.out.printf("No tiene solución");
            case 6 -> System.out.printf("Cualquier número es solución");
        }

    }

}

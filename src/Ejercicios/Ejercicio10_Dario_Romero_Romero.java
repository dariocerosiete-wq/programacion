package Ejercicios;

import java.util.Scanner;

public class Ejercicio10_Dario_Romero_Romero {
    public static void main(String[] args) {
        String nombreTrabajador;
        int horasTrabajadas;
        double salarioNeto, salarioBruto, tarifa, impuesto = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cómo te llamas?: ");
        nombreTrabajador = sc.nextLine();

        System.out.print("¿Cuántas horas has trabajado?: ");
        horasTrabajadas = sc.nextInt();

        System.out.print("¿Cuánto cobras por hora?: ");
        tarifa = sc.nextDouble();

        // Cálculo bruto según horas trabajadas y tarifa
        if (horasTrabajadas <= 35) {
            salarioBruto = horasTrabajadas * tarifa;
        } else {
            salarioBruto = (35 * tarifa) + ((horasTrabajadas - 35) * tarifa * 1.5);
        }

        if (salarioBruto <= 500) {
            impuesto = 0;
        } else if (salarioBruto <= 900) {
            impuesto = (salarioBruto - 500) * 0.25;
        } else {
            impuesto = (400 * 0.25) + ((salarioBruto - 900) * 0.45);
        }

        salarioNeto = salarioBruto - impuesto;

        System.out.println();
        System.out.println("Trabajador: " + nombreTrabajador);
        System.out.printf("Salario bruto: %.2f €%n", salarioBruto);
        System.out.printf("Salario impuestos: %.2f €%n", impuesto);
        System.out.printf("Salario neto: %.2f €%n", salarioNeto);
    }
}

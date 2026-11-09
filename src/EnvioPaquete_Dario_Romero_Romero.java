/*
Examen de programación
Nombre: Dario Romero Romero
Curso: 1ºDAW
Mi codigo va sobre la entrega de paquetes
 */

import java.util.Scanner;


public class EnvioPaquete_Dario_Romero_Romero {
    public static void main(String[] args) {

        //Creando las variables con el escaner
        final String s = "Si";
        final String n = "No";
        String nombreDestinatario, urgente;
        int peso, p = 5, b = 8, c = 12, tarifaBase = 0, pesoPrecio = 0;
        double envioUrgente = 0;
        Scanner sc = new Scanner(System.in);

        //Pidiendo los datos de entrada al usuario
        System.out.print("Introduzca su nombre: ");
        nombreDestinatario = sc.nextLine();

        System.out.print("Introduzca su zona (p = peninsula, b = baleares, c = canarias): ");
        char zonaSituada = sc.next().charAt(0);

        System.out.print("Introduzca el peso: ");
        peso = sc.nextInt();

        System.out.print("El envio es urente (s) o (n): ");
        urgente = sc.next();

        //A ver si la zona es valida
        if (zonaSituada == p) {
            tarifaBase = 5;
        } else if (zonaSituada == b) {
            tarifaBase = 8;
        } else if (zonaSituada == c) {
            tarifaBase = 12;
        } else {

        }

        //Validando si el peso es correcto
        if (peso < 1 || peso > 30) {
            System.out.println("Peso no valido");
        } else if (peso < 2) {
            System.out.println("No hay recargo");
        } else if (peso > 2 || peso < 10) {
            pesoPrecio = 3;
        } else if (peso > 10) {
            pesoPrecio = 10;
        }


        //Viendo si el envio es urgente
        if (urgente == s) {
            envioUrgente = tarifaBase * 0.5;
        } else if (urgente == n) {
            System.out.println("No se aplica aumento");
        }

        double total = (tarifaBase + pesoPrecio + envioUrgente);

        //Resultado
        System.out.println("Destinatario: " + nombreDestinatario);
        System.out.println("Zona (P/B/C): " + zonaSituada);
        System.out.println("Peso (kg): " + peso);
        System.out.println("Envio para " + nombreDestinatario + " " + "(zona)" + " " + zonaSituada);
        System.out.printf("%-16s%8d kg%n", "Peso", peso);
        System.out.println("Tarifa base" + "             " + tarifaBase);
        System.out.println("Recargo peso" + "            " + pesoPrecio);
        System.out.println("Urgencia" + "                " + envioUrgente);
        System.out.printf("%-16s%8.2f €%n", "Total", total);

    }
}

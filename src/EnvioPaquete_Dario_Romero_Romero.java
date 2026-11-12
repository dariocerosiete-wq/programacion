/*
Examen de programación
Nombre: Dario Romero Romero
Curso: 1ºDAW
Mi codigo va sobre la entrega de paquetes
 */

import java.util.Scanner;


public class EnvioPaquete_Dario_Romero_Romero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //declaración de variables
        final int SIN_RECARGO = 0, RECARGO_SIMPLE = 3, RECARGO_PESADO = 7;
        final int TARIFA_PENINSULA = 5, TARIFA_BALEARES = 8, TARIFA_CANARIAS = 12;
        String destinatario, zonaIntroducida, urgenciaIntroducida;
        int peso;
        boolean urgente;
        char zona;
        double tarifaBase, recargo = 0, precioTotal = 0;

        // lectura de datos
        System.out.print("Introduce el nombre del destinatario: ");
        destinatario = sc.nextLine();

        System.out.print("Introduce la zona de destino (P/B/C, península, Baleares, Canarias respectivamente: ");
        zonaIntroducida = sc.next();
        zona = zonaIntroducida.toUpperCase().charAt(0);

        System.out.print("Introduce el peso del paquete: ");
        peso = sc.nextInt();

        System.out.print("Introduce si es urgente o no: ");
        urgenciaIntroducida = sc.next();
        urgente = urgenciaIntroducida.toUpperCase().charAt(0) == 'S';

        tarifaBase = switch (zona) {
            case 'P' -> TARIFA_PENINSULA;
            case 'B' -> TARIFA_BALEARES;
            case 'C' -> TARIFA_CANARIAS;
            default -> -1;
        };

        // validamos los datos
        if (tarifaBase == -1) {
            System.out.println("Zona no válida");
            System.exit(0);
        }

        if (peso < 1 || peso > 30) {
            System.out.println("Peso no válido");
            System.exit(0);
        }

        // calculamos el recargo
        if (peso <= 2) {
            recargo = SIN_RECARGO;
        } else if (peso <= 10) {
            recargo = RECARGO_SIMPLE;
        } else {
            recargo = RECARGO_PESADO;
        }

        precioTotal = tarifaBase + recargo;

        if (urgente) {
            precioTotal *= 1.5;
        }

        System.out.printf("Envío para %s (zona %c)%n", destinatario, zona);
        System.out.printf("%-16s%8d kg%n", "Peso", peso);
        System.out.printf("%-16s%8.2f €%n", "Tarifa base", tarifaBase);
        System.out.printf("%-16s%8.2f €%n", "Recargo peso", recargo);
        System.out.printf("%-16s%8.2f €%n", "Urgencia", (tarifaBase + recargo) * 0.5);
        System.out.printf("%-16s%8.2f €%n", "TOTAL", precioTotal);

    }
}

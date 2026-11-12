/*
Examen de programación
Nombre: Dario Romero Romero
Curso: 1ºDAW
Mi codigo va sobre la entrega de paquetes
 */

import java.util.Scanner;


public class EnvioPaquete_Dario_Romero_Romero {
    public static void main(String[] args) {
        final double TARIFA_PENINSULA = 5;
        final double TARIFA_BALEARES = 8;
        final double TARIFA_CANARIAS = 12;
        final int PESO_MAXIMO = 30;
        final int PESO_LIGERO = 2;           // hasta 2 kg no hay recargo
        final int PESO_MEDIO = 10;           // de 3 a 10 kg, recargo medio
        final double RECARGO_MEDIO = 3;
        final double RECARGO_PESADO = 7;     // más de 10 kg
        final double RECARGO_URGENTE = 0.5;  // 50 % sobre tarifa + recargo
        Scanner entrada = new Scanner(System.in);
        String destinatario;
        char zona, urgente;
        int peso;
        double tarifa, recargoPeso, urgencia, total;

        // Lectura: el destinatario va primero porque puede tener espacios; las letras se pasan a mayúscula
        System.out.print("Destinatario: ");
        destinatario = entrada.nextLine();
        System.out.print("Zona (P/B/C): ");
        zona = Character.toUpperCase(entrada.next().charAt(0));
        System.out.print("Peso (kg): ");
        peso = entrada.nextInt();
        System.out.print("Urgente (S/N): ");
        urgente = Character.toUpperCase(entrada.next().charAt(0));

        // Tarifa base según la zona: -1 marca una zona desconocida
        tarifa = switch (zona) {
            case 'P' -> TARIFA_PENINSULA;
            case 'B' -> TARIFA_BALEARES;
            case 'C' -> TARIFA_CANARIAS;
            default -> -1;
        };

        // Validaciones: un mensaje y se termina el programa
        if (tarifa < 0) {
            System.out.println("Zona no válida");
            System.exit(0);
        }
        if (peso < 1 || peso > PESO_MAXIMO) {
            System.out.println("Peso no válido");
            System.exit(0);
        }

        // Recargo por peso, por tramos
        if (peso <= PESO_LIGERO) {
            recargoPeso = 0;
        } else if (peso <= PESO_MEDIO) {
            recargoPeso = RECARGO_MEDIO;
        } else {
            recargoPeso = RECARGO_PESADO;
        }

        // Urgencia: la mitad de lo anterior, sólo si se pide
        urgencia = urgente == 'S' ? (tarifa + recargoPeso) * RECARGO_URGENTE : 0;
        total = tarifa + recargoPeso + urgencia;

        // Salida en forma de ticket: etiquetas a la izquierda, cantidades a la derecha y su unidad
        System.out.println("Envío para " + destinatario + " (zona " + zona + ")");
        System.out.printf("%-16s%8d kg%n", "Peso", peso);
        System.out.printf("%-16s%8.2f €%n", "Tarifa base", tarifa);
        System.out.printf("%-16s%8.2f €%n", "Recargo peso", recargoPeso);
        System.out.printf("%-16s%8.2f €%n", "Urgencia", urgencia);
        System.out.printf("%-16s%8.2f €%n", "TOTAL", total);
    }
}

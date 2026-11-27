package Ejercicios_Bucles;
/*
El contrario del ejercicio 13: el ordenador «piensa» un número del 1 al 100 con Random,
que viste en la unidad 4, y el usuario lo adivina en un máximo de 7 intentos.
Después de cada propuesta el programa dice «demasiado alto» o «demasiado bajo». Las propuestas que no son un número o están fuera del rango se rechazan
sin que el programa se detenga y sin contar como intento.
 */

import java.util.Random;
import java.util.Scanner;

public class Ejercicio25DarioRomeroRomero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        final int MAX_INTENTOS = 7;
        int secreto = random.nextInt(100) + 1; // Número aleatorio entre 1 y 100
        int intentos = 0;
        boolean acertado = false;

        for (int i = 1; i <= MAX_INTENTOS; i++) {
            System.out.print("Intento " + intentos + "/" + MAX_INTENTOS + " - Introduce tu número: ");

            if (!sc.hasNextInt()) {
                String basura = sc.next();
                System.out.println("Entrada no válida ('" + basura + "'). Introduce un número entero.");
                continue; // No suma 'intento' y repite la misma vuelta
            }

            int propuesta = sc.nextInt();

            // 2. Validación de rango
            if (propuesta < 1 || propuesta > 100) {
                System.out.println("Fuera de rango. Debe estar entre 1 y 100.");
                continue; // No suma 'intento' y repite la misma vuelta
            }

            // Propuesta válida: comprobamos acierto o pista
            if (propuesta == secreto) {
                acertado = true;
                break;
            } else if (propuesta < secreto) {
                System.out.println("Demasiado bajo.");
            } else {
                System.out.println("Demasiado alto.");
            }

            // Solo avanzamos al siguiente intento si no acertó y la propuesta era válida
            intentos++;
        }

        if (acertado) {
            System.out.println("¡Has ganado! El número secreto era el " + secreto + ".");
        } else {
            System.out.println("Has agotado tus " + MAX_INTENTOS + " intentos. El número secreto era el " + secreto + ".");
        }

    }
}



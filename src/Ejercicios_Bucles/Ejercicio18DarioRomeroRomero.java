package Ejercicios_Bucles;

/*
Escribe un programa que calcule la suma de los cuadrados de los 5 primeros números naturales:
 1² + 2² + 3² + 4² + 5².
 */
public class Ejercicio18DarioRomeroRomero {
    public static void main(String[] args) {
        int numerosNaturales = 5;
        int suma = 0;
        for (int i = 1; i <= numerosNaturales; i++) {
            System.out.println(suma += i * i);
        }
    }
}

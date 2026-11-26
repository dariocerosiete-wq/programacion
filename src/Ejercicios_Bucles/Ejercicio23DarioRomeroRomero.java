package Ejercicios_Bucles;

/*
int i = 1, s = 0; while (i < 5) { s += i; i += 2; } System.out.println(i + " " + s);
int c = 0; for (int k = 10; k > 0; k -= 3) { c++; } System.out.println(c);
int x = 10; do { x -= 4; } while (x > 0); System.out.println(x);
int n = 0; for (int k = 1; k <= 10; k++) { if (k * k > 30) { break; } n = k; } System.out.printlnNo;
int t = 0; for (int k = 1; k <= 6; k++) { if (k % 3 == 0) { continue; } t += k; } System.out.println(t);
int v = 0; for (int a = 1; a <= 3; a++) { for (int b = a; b <= 3; b++) { v++; } } System.out.println(v);
int m = 0, w = 0; while (m++ < 3) { w += m; } System.out.println(m + " " + w);
double d = 0; int c = 0; while (d != 1.0 && c < 20) { d += 0.1; c++; } System.out.println(c);
 */
public class Ejercicio23DarioRomeroRomero {
    public static void main(String[] args) {

        //Ha echo 2 vueltas, porque la principio no cuenta la vuelta
        int i = 1, s = 0;
        while (i < 5) {
            s += i;
            i += 2;
        }
        System.out.println(i + " " + s);


        //Ha echo 4 vueltas
        /*int c = 0;
        for (int k = 10; k > 0; k -= 3) {
            c++;
        }
        System.out.println(c);
        */

        //Ha dado 3 vueltas
        int x = 10;
        do {
            x -= 4;
        } while (x > 0);
        System.out.println(x);


        //Hace 6 vueltas
        int n = 0;
        for (int k = 1; k <= 10; k++) {
            if (k * k > 30) {
                break;
            }
            n = k;
        }
        System.out.println("No");


        //Ha echo 6 vueltas
        int t = 0;
        for (int k = 1; k <= 6; k++) {
            if (k % 3 == 0) {
                continue;
            }
            t += k;
        }
        System.out.println(t);


        //Ha realizado 6 vueltas
        int v = 0;
        for (int a = 1; a <= 3; a++) {
            for (int b = a; b <= 3; b++) {
                v++;
            }
        }
        System.out.println(v);


        //Ha realizado 3 vueltas, m ha cambiado en el momento del bucle while en la parte de m++
        int m = 0, w = 0;
        while (m++ < 3) {
            w += m;
        }
        System.out.println(m + " " + w);

        //Da 20n vueltas, si no existiese la segunda condicion seria infinito el bucle
        double d = 0;
        int c = 0;
        while (d != 1.0 && c < 20) {
            d += 0.1;
            c++;
        }
        System.out.println(c);
    }
}

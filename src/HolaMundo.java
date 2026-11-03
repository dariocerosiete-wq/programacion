//Una linea

/*
EScribir lo que me de la ganma
porque es un comentario
que no afecta al codigo
Autor: Dario Romero
 */

/**
 * Este es el metodo principal
 *
 */
public class HolaMundo {

    public static void main(String[] args) {

        //Variables primitivas
        byte variableMuyCortita;
        short variableMasLarga;
        int estaEsMiVariable;
        int variable;
        long variableMuchoMasLarga;
        float variableConDecimales;
        double variableConMuchosDecimales;
        char variableDeCaracter;
        boolean variableLogica;

        //VARIABLE CLASE
        String variableDeCadena;

        variableMasLarga = 32766;
        System.out.println(variableMasLarga);

        variableMasLarga +=1;
        System.out.println(variableMasLarga);

        //Te lo pone en negativo
        variableMasLarga +=1;
        System.out.println(variableMasLarga);

        double IVA_REDUCIDO = 0.10;
        final double IVA = 0.21;

        System.out.println("Iva general = "+IVA);
        System.out.println("Iva reducido = "+IVA_REDUCIDO);

        //10.000.000
        int miFortuna = 10_000_000;

        //2.000.000
        int tuFortuna = 2_000_000;

        System.out.println("Mi dinero = "+miFortuna);
        System.out.println("Tu dinero = "+tuFortuna);

        //"\n": Para ponwerlo en una nueva linea, "\t": Para tabularlo, \": para ponerlo entrecomillado
        System.out.println("Hola mundo\n\tAdios \"gente\"");

        // "\\": Para poner una barra al lado
        System.out.println("Hola mundooooo\\");





    }
}

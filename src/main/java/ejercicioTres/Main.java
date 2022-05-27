package ejercicioTres;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        OperacionesCalculo op = new OperacionesCalculo(5.0,2.0);
        System.out.println(op.calcularDerivada());
        System.out.println(op.calcularIntegral());
    }
}

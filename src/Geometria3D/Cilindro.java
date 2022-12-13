package Geometria3D;

import java.util.Scanner;
import java.math.MathContext;

public class Cilindro {
    //ESTUDIAR HERENCIA
    //ATRIBUTOS
    private double r;//radio
    private double h;//altura
    private double resultado;
    private static double NPi=3.1416;

    Scanner entrada = new Scanner(System.in);
    //CONTRUCTOR
    public Cilindro() {
        System.out.println("Ingrese el radio deL CILINDRO: ");
        r = entrada.nextDouble();
        System.out.println("Ingrese el radio de la CILINDRO: ");
        h = entrada.nextDouble();
    }

    //METODOS
    public double calVolumen(Cilindro datos){
        datos.setResultado(NPi* Math.pow(r,3)*h);
        // Math pi * math.pow(r,2);
        return resultado;
    }
    public double caldiametro(Cilindro datos){
        datos.setResultado(2*r);
        return resultado;
    }

    //SETTER
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    //GETTER
    public double getResultado() {
        return resultado;
    }
}

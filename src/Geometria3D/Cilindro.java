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
        System.out.println("Ingrese la altura de la CILINDRO: ");
        h = entrada.nextDouble();
    }

    //METODOS
    public double calVolumen(Cilindro figura3dC){
        figura3dC.setResultado(NPi* Math.pow(r,2)*h);
        // Math pi * math.pow(r,2);
        return resultado;
    }
    public double calAreaLateral(Cilindro figura3dC){
        figura3dC.setResultado(2*NPi*r*h);
        return resultado;
    }

    public double calAreaTotal(Cilindro figura3dC){
        figura3dC.setResultado(2*NPi*r*(r+h));
        return resultado;
    }

    //SETTER
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}

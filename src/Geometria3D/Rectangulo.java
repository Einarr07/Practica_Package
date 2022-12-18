package Geometria3D;

import java.util.Scanner;

public class Rectangulo {
    private double l;//longitud
    private double b; // base
    private double h; // altura
    private double resultado;

    Scanner entrada = new Scanner(System.in);
    //CONTRUCTOR
    public Rectangulo() {
        System.out.println("Ingrese la longitud de RECTANGULO: ");
        l = entrada.nextDouble();
        System.out.println("Ingrese la base de RECTANGULO: ");
        b = entrada.nextDouble();
        System.out.println("Ingrese la altura de RECTANGULO: ");
        h = entrada.nextDouble();
    }

    //METODOS
    public double calVolumen(Rectangulo figura3dR){
        figura3dR.setResultado(l*b*h);
        return resultado;
    }
    public double calAreaLateral(Rectangulo figura3dR){
        figura3dR.setResultado(2*b*h + 2*h*l);
        return resultado;
    }

    public double calAreaTotal(Rectangulo figura3dR){
        figura3dR.setResultado(2*b*h + 2*h*l + 2*b*l);
        return resultado;
    }

    //SETTER
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}

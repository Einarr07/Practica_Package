package Geometria3D;

import java.util.Scanner;

public class Octaedro {
    private double l;//longitud
    private double resultado;

    Scanner entrada = new Scanner(System.in);
    //CONTRUCTOR
    public Octaedro() {
        System.out.println("Ingrese la longitud del OCTAEDRO: ");
        l = entrada.nextDouble();
    }

    //METODOS
    public double calVolumen(Octaedro figura3dO){
        figura3dO.setResultado((Math.pow(l,3)*(Math.sqrt(2))/(3)));
        return resultado;
    }
    public double calAltura(Octaedro figura3dO){
        figura3dO.setResultado((l* Math.sqrt(2)));
        return resultado;
    }

    public double calAreaTotal(Octaedro figura3dO){
        figura3dO.setResultado(Math.pow(l,2) * 2 * Math.sqrt(3));
        return resultado;
    }

    //SETTER
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}

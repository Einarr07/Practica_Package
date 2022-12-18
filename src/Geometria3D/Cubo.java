package Geometria3D;

import java.util.Scanner;

public class Cubo {
    private double l;//longitud de los lados
    private double resultado;

    Scanner entrada = new Scanner(System.in);
    //CONTRUCTOR
    public Cubo() {
        System.out.println("Ingrese la longitud de CUBO: ");
        l = entrada.nextDouble();
    }

    //METODOS
    public double calVolumen(Cubo figura3dC){
        figura3dC.setResultado(Math.pow(l,3));
        return resultado;
    }
    public double calAreaLateral(Cubo figura3dC){
        figura3dC.setResultado(Math.pow(l,2));
        return resultado;
    }

    public double calAreaTotal(Cubo figura3dT){
        figura3dT.setResultado(6*Math.pow(l,2));
        return resultado;
    }

    //SETTER
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}

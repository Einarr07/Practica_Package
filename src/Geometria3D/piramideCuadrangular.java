package Geometria3D;

import java.util.Scanner;

public class piramideCuadrangular {
    private double l;//longitud de los lados
    private double h;//altura
    private double resultado;

    Scanner entrada = new Scanner(System.in);
    //CONTRUCTOR
    public piramideCuadrangular() {
        System.out.println("Ingrese la longitud de PIRAMIDE CUADRANGUALR: ");
        l = entrada.nextDouble();
        System.out.println("Ingrese la altura de PIRAMIDE CUADRANGUALR: ");
        h = entrada.nextDouble();
    }

    //METODOS
    public double calVolumen(piramideCuadrangular figura3dP){
        figura3dP.setResultado((0.3333) * Math.pow(l,2)*h);
        return resultado;
    }
    public double calAreaBase(piramideCuadrangular figura3dP){
        figura3dP.setResultado(l*l);
        return resultado;
    }

    public double calApotema(piramideCuadrangular figura3dP){
        figura3dP.setResultado(Math.sqrt(Math.pow(l,2) + Math.pow(h,2)));
        return resultado;
    }

    //SETTER
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}

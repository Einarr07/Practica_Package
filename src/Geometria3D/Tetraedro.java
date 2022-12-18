package Geometria3D;

import java.util.Scanner;

public class Tetraedro {
    private double l;//longitud de los lados
    private double resultado;

    Scanner entrada = new Scanner(System.in);
    //CONTRUCTOR
    public Tetraedro() {
        System.out.println("Ingrese la longitud de TETRAEDRO: ");
        l = entrada.nextDouble();
    }

    //METODOS
    public double calVolumen(Tetraedro figura3dT){
        figura3dT.setResultado((Math.pow(l,3)*Math.sqrt(2))/(12));
        // Math pi * math.pow(r,2);
        return resultado;
    }
    public double calAltura(Tetraedro figura3dC){
        figura3dC.setResultado((l* Math.sqrt(6))/(3));
        return resultado;
    }

    public double calAreaTotal(Tetraedro figura3dT){
        figura3dT.setResultado(Math.sqrt(3) * Math.pow(l,2));
        return resultado;
    }

    //SETTER
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

}

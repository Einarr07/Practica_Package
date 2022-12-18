package Geometria3D;

import java.util.Scanner;

public class Cono {
    private double r;//radio
    private double h;//altura
    private double resultado;
    private static double NPi=3.1416;

    Scanner entrada = new Scanner(System.in);
    //CONTRUCTOR
    public Cono() {
        System.out.println("Ingrese el radio deL CONO: ");
        r = entrada.nextDouble();
        System.out.println("Ingrese la altura de la CONO: ");
        h = entrada.nextDouble();
    }

    //METODOS
    public double calVolumen(Cono figura3dCo){
        figura3dCo.setResultado((NPi* Math.pow(r,2)*h)/3);
        // Math pi * math.pow(r,2);
        return resultado;
    }
    public double calAlturaInclinada(Cono figura3dCo){
        figura3dCo.setResultado(Math.sqrt(Math.pow(r,2) + Math.pow(h,2)));
        return resultado;
    }

    public double calAreaTotal(Cono figura3dCo){
        figura3dCo.setResultado(NPi*r*(resultado+r));
        return resultado;
    }

    //SETTER
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}

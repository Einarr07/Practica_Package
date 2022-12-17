package Geometria3D;

import java.util.Scanner;

public class prismaHexagonal {
    private double l; //longitud de los lados
    private double h; // altura
    private double resultado;

    Scanner entrada = new Scanner(System.in);
    //CONTRUCTOR
    public prismaHexagonal() {
        System.out.println("Ingrese la longitud de PRISMA HEXAGONAL: ");
        l = entrada.nextDouble();
        System.out.println("Ingrese la altura de PRISMA HEXAGONAL: ");
        h = entrada.nextDouble();
    }

    //METODOS
    public double calVolumen(prismaHexagonal figura3dPH){
        figura3dPH.setResultado(((3*Math.sqrt(3))/(2))* Math.pow(l,2)* h);
        return resultado;
    }
    public double calApotema(prismaHexagonal figura3dPH){
        figura3dPH.setResultado((resultado)/3*l*h);
        return resultado;
    }

    public double calAreaTotal(prismaHexagonal figura3dPH){
        figura3dPH.setResultado(6*resultado*l + 6*l*h);
        return resultado;
    }

    //SETTER
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}

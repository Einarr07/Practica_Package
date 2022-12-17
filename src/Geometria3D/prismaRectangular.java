package Geometria3D;

import java.util.Scanner;

public class prismaRectangular {
    private double l; //longitud de los lados
    private double h; // altura
    private double resultado;

    Scanner entrada = new Scanner(System.in);
    //CONTRUCTOR
    public prismaRectangular() {
        System.out.println("Ingrese la longitud de PRISMA TRIANGULAR: ");
        l = entrada.nextDouble();
        System.out.println("Ingrese la altura de PRISMA TRIANGULAR: ");
        h = entrada.nextDouble();
    }

    //METODOS
    public double calVolumen(prismaRectangular figura3dPT){
        figura3dPT.setResultado(((Math.sqrt(3))/(4))* Math.pow(l,2) * h);
        return resultado;
    }
    public double calAreaLateral(prismaRectangular figura3dPT){
        figura3dPT.setResultado(3*l*h);
        return resultado;
    }

    public double calAreaTotal(prismaRectangular figura3dPT){
        figura3dPT.setResultado(l * (((Math.sqrt(3))/(2))*l + 3*h));
        return resultado;
    }

    //SETTER
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}

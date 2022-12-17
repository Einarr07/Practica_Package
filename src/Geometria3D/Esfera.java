package Geometria3D;
import java.util.Scanner;
import java.math.MathContext;

public class Esfera {
    //ATRIBUTOS
    private double r;// radio de la esfera
    private double h;// altura del casquete
    private double resultado;
    private static double NPi=3.1416;

    Scanner entrada = new Scanner(System.in);
    //CONTRUCTOR
    public Esfera() {
        System.out.println("Ingrese el radio de ESFERA: ");
        r = entrada.nextDouble();
        System.out.println("Ingrese la altura de CASQUETE: ");
        h = entrada.nextDouble();
    }

    //METODOS
    public double calVolumen(Esfera figura3dE){
        figura3dE.setResultado((1.3333)*NPi* Math.pow(r,3));
        return resultado;
    }
    public double caldiametro(Esfera figura3dE){
        figura3dE.setResultado(2*r);
        return resultado;
    }

    public double calcasquete(Esfera figura3dE){
        figura3dE.setResultado((0.3333)*NPi* Math.pow(h,2)*(3*r-h));
        return resultado;
    }

    //SETTER
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
}

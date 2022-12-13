package Geometria3D;
import java.util.Scanner;

public class Esfera {
    //ATRIBUTOS
    private double r;
    private double resultado;
    private static double NPi=3.1416;

    Scanner entrada = new Scanner(System.in);
    //CONTRUCTOR
    public Esfera() {
        System.out.println("Ingrese el radio de la esfera: ");
        r = entrada.nextDouble();
    }

    //METODOS
    public double calVolumen(Esfera datos){
        datos.setResultado((4/3)*NPi*r*r*r);
        // Math pi * math.pow(r,2);
        return resultado;
    }
    public double caldiametro(Esfera datos){
        datos.setResultado(2*r);
        return resultado;
    }

    //SETTER
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    //GETTER
    public double getResultado() {
        return resultado;
    }
}

package Geometria2D;
import java.util.Scanner;
public class Cuadrado {
    //Atributo
    private double area, perimetro;
    Scanner entrada = new Scanner(System.in);
    //Constructor
    private Cuadrado(){
        area = 0;
        perimetro =0;
    }

    public void cuadrado_areas(Cuadrado datos1){
        float base, altura;
        System.out.println("Ingrese la base del cuadrado");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del cuadrado");
        altura = entrada.nextDouble();
        if (base != altura){
            System.out.println("Si la base o la altura son diferentes, no es un cuadrado");
        }
        else {
            area = altura * base;
            System.out.println("El area del cuadrado es: " + area);
        }
    }
    public void cuadrado_perimetro(Cuadrado datos2){
        double perimetro;
        System.out.println("Ingrese la dimension del cuadrado");
        altura = entrada.nextDouble();
        perimetro = getAltura() + getAltura() + getAltura() + getAltura();
        System.out.println("El perimetro del cuadrado es: " +  perimetro);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}

package Geometria2D;
import java.util.Scanner;
public class Rectangulo {
    //Atributo

    private double base, altura;

    Scanner entrada = new Scanner(System.in);
    //Constructor
    private Rectangulo(){
        base = 0;
        altura =0;
    }

    public void rectangulo_area(Rectangulo datos3){
        double area;
        System.out.println("Ingrese la base del regtangulo");
        datos3.setBase(entrada.nextFloat());
        System.out.println("Ingrese la altura del regtangulo");
        datos3.setAltura(entrada.nextFloat());
        area = getBase() * getAltura();
        System.out.println("El area del regtangulo es: " + area);

    }

    public void rectangulo_perimetro(Rectangulo datos6){
        double perimetro;
        System.out.println("Ingrese la altura del rectangulo");
        datos6.setAltura(entrada.nextFloat());
        System.out.println("Ingrese la base del rectangulo");
        datos6.setBase(entrada.nextFloat());
        perimetro = getAltura() + getAltura() + getBase() + getBase();
        System.out.println("El perimetro del regtangulo es: " +  perimetro);
    }

    private double getBase() {
        return base;
    }

    private void setBase(double base) {
        this.base = base;
    }

    private double getAltura() {
        return altura;
    }

    private void setAltura(double altura) {
        this.altura = altura;
    }
}

package Geometria2D;

import java.util.Scanner;

public class Triangulo {
    //Atributo
    private double base, altura;
    private double area;
    Scanner entrada = new Scanner(System.in);
    //Constructor
    public Triangulo(){
        double base, altura;
        System.out.println("Ingrese la base del triangulo");
        base = entrada.nextFloat();
        System.out.println("Ingrese la altura del triangulo");
        altura = entrada.nextFloat();
        area = 0;
    }
    public void triangulo_area(Triangulo datos1){
        area = (base * altura) / 2;
        System.out.println("El area del triangulo es: " + area);
    }

    public double getArea() {
        return area;
    }
}
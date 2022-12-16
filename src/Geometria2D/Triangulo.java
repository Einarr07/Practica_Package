package Geometria2D;
import java.util.Scanner;

public class Triangulo {
    //Atributo
    public float baseTriangulo, alturaTriangulo;
    private float areaTriangulo;
    Scanner entrada = new Scanner(System.in);
    //Constructor
    public Triangulo(){
        baseTriangulo = 0;
        alturaTriangulo = 0;
        areaTriangulo = 0;
    }

    public float getAreaTriangulo() {
        areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        return areaTriangulo;
    }

    public void setBaseTriangulo(float baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    public void setAlturaTriangulo(float alturaTriangulo) {
        this.alturaTriangulo = alturaTriangulo;
    }
}
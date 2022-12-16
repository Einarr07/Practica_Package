package Geometria2D;
import java.util.Scanner;
public class Cuadrado {
    //Atributo
    public float baseCuadrado, alturaCuadrado;
    private float areaCuadrado, perimetroCuadrado;
    Scanner entrada = new Scanner(System.in);
    //Constructor
    public Cuadrado(){
        baseCuadrado = 0;
        alturaCuadrado = 0;
        areaCuadrado = 0;
        perimetroCuadrado = 0;
    }

    public float getAreaCuadrado() {
        areaCuadrado = baseCuadrado * alturaCuadrado;
        return areaCuadrado;
    }

    public float getPerimetroCuadrado() {
        perimetroCuadrado = alturaCuadrado + alturaCuadrado + alturaCuadrado + alturaCuadrado;
        return perimetroCuadrado;
    }

    public void setBaseCuadrado(float baseCuadrado) {
        this.baseCuadrado = baseCuadrado;
    }

    public void setAlturaCuadrado(float alturaCuadrado) {
        this.alturaCuadrado = alturaCuadrado;
    }
}

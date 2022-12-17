package Geometria2D;

public class Cuadrado {
    //Atributo
    public float alturaCuadrado;
    public float areaCuadrado, perimetroCuadrado;
    public double diagonalCuadrado;
    //Constructor
    public Cuadrado(){
        alturaCuadrado = 0;
        areaCuadrado = 0;
        perimetroCuadrado = 0;
        diagonalCuadrado = 0;
    }
    //Area
    public float getAreaCuadrado() {
        areaCuadrado = alturaCuadrado * alturaCuadrado;
        return areaCuadrado;
    }
    //Perimetro
    public float getPerimetroCuadrado() {
        perimetroCuadrado = alturaCuadrado + alturaCuadrado + alturaCuadrado + alturaCuadrado;
        return perimetroCuadrado;
    }
    //Diagonal
    public double getDiagonalCuadrado() {
        diagonalCuadrado = Math.sqrt(Math.pow(alturaCuadrado, 2) + Math.pow(alturaCuadrado, 2));
        return diagonalCuadrado;
    }

    public void setAlturaCuadrado(float alturaCuadrado) {
        this.alturaCuadrado = alturaCuadrado;
    }
}

package Geometria2D;

public class Triangulo {
    //Atributo
    public float baseTriangulo, alturaTriangulo, ladosTriangulo;
    public float areaTriangulo, perimetroTriangulo;
    public double diagonalTriangulo;
    //Constructor
    public Triangulo(){
        baseTriangulo = 0;
        alturaTriangulo = 0;
        ladosTriangulo = 0;
        areaTriangulo = 0;
        perimetroTriangulo = 0;
        diagonalTriangulo = 0;
    }
    //Area
    public float getAreaTriangulo() {
        areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        return areaTriangulo;
    }
    //Perimetro
    public float getPerimetroTriangulo() {
        perimetroTriangulo = baseTriangulo + ladosTriangulo + ladosTriangulo;
        return perimetroTriangulo;
    }
    //Diagonal

    public double getDiagonalTriangulo() {
        diagonalTriangulo = Math.sqrt(Math.pow(baseTriangulo, 2) + Math.pow(alturaTriangulo, 2));
        return diagonalTriangulo;
    }

    public void setBaseTriangulo(float baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    public void setAlturaTriangulo(float alturaTriangulo) {
        this.alturaTriangulo = alturaTriangulo;
    }

    public void setLadosTriangulo(float ladosTriangulo) {
        this.ladosTriangulo = ladosTriangulo;
    }
}
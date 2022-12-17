package Geometria2D;

public class Rectangulo {
    //Atributo

    public float baseRectangulo, alturaRectangulo;
    public float areaRectangulo, perimetroRectangulo;
    public double diagonalRectangulo;

    //Constructor
    public Rectangulo(){
        baseRectangulo = 0;
        alturaRectangulo = 0;
        areaRectangulo = 0;
        perimetroRectangulo = 0;
        diagonalRectangulo = 0;
    }
    //Area
    public float getAreaRectangulo() {
        areaRectangulo = baseRectangulo * alturaRectangulo;
        return areaRectangulo;
    }
    //Perimetro
    public float getPerimetroRectangulo() {
        perimetroRectangulo = baseRectangulo + alturaRectangulo + alturaRectangulo + baseRectangulo;
        return perimetroRectangulo;
    }
    //Diagonal
    public double getDiagonalRectangulo() {
        diagonalRectangulo = Math.sqrt(Math.pow(baseRectangulo, 2) + Math.pow(alturaRectangulo, 2));
        return diagonalRectangulo;
    }

    public void setBaseRectangulo(float baseRectangulo) {
        this.baseRectangulo = baseRectangulo;
    }

    public void setAlturaRectangulo(float alturaRectangulo) {
        this.alturaRectangulo = alturaRectangulo;
    }
}

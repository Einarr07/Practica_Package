package Geometria2D;

public class Hexagono {
    //Atributos
    public float longitudHexagono, apotemaHexagono, ladosHexagono;
    public float areaHexagono, perimetroHexagono, diagonalHexagono;
    //Constructor
    public Hexagono(){
        longitudHexagono = 0;
        apotemaHexagono = 0;
        ladosHexagono = 6;
        areaHexagono = 0;
        perimetroHexagono = 0;
    }
    //Area
    public float getAreaHexagono() {
        areaHexagono = 3 * longitudHexagono * apotemaHexagono;
        return areaHexagono;
    }
    //Perimetro
    public float getPerimetroHexagono() {
        perimetroHexagono = 6 * longitudHexagono;
        return perimetroHexagono;
    }
    //Diagonal
    public float getDiagonalHexagono() {
        diagonalHexagono = (ladosHexagono * (ladosHexagono - 3) / 2);
        return diagonalHexagono;
    }

    public void setLongitudHexagono(float longitudHexagono) {
        this.longitudHexagono = longitudHexagono;
    }

    public void setApotemaHexagono(float apotemaHexagono) {
        this.apotemaHexagono = apotemaHexagono;
    }
}

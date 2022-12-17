package Geometria2D;

public class Pentagono {
    //Atributos
    public float longitudPentagono, apotemaPentagono, ladosPentagono;
    public float areaPentagono, perimetroPentagono, diagonalPentagono;
    //Constructor
    public Pentagono(){
        longitudPentagono = 0;
        apotemaPentagono = 0;
        ladosPentagono = 5;
        areaPentagono = 0;
        perimetroPentagono = 0;
        diagonalPentagono = 0;
    }
    //Area
    public float getAreaPentagono() {
        areaPentagono = (5 * longitudPentagono * apotemaPentagono) / 2;
        return areaPentagono;
    }
    //Perimetro
    public float getPerimetroPentagono() {
        perimetroPentagono = 5 * longitudPentagono;
        return perimetroPentagono;
    }
    //Diagonal
    public float getDiagonalPentagono() {
        diagonalPentagono = (ladosPentagono * (ladosPentagono - 3) / 2);
        return diagonalPentagono;
    }

    public void setLongitudPentagono(float longitudPentagono) {
        this.longitudPentagono = longitudPentagono;
    }

    public void setApotemaPentagono(float apotemaPentagono) {
        this.apotemaPentagono = apotemaPentagono;
    }

    public void setLadosPentagono(float ladosPentagono) {
        this.ladosPentagono = ladosPentagono;
    }
}

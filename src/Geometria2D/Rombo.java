package Geometria2D;

public class Rombo {
    //Atributos
    public float diagonalMayorR, diagonalMenorR,ladosRombo;
    public float areaRombo;
    public double perimetroRombo, diagonalRombo;
    //Constructor
    public Rombo(){
        diagonalMayorR = 0;
        diagonalMenorR = 0;
        ladosRombo = 0;
        areaRombo = 0;
        perimetroRombo = 0;
        diagonalRombo = 0;
    }
    //Area
    public float getAreaRombo() {
        areaRombo = (diagonalMayorR * diagonalMenorR) / 2;
        return areaRombo;
    }
    //Perimetro
    public double getPerimetroRombo() {
        perimetroRombo = Math.sqrt(Math.pow(diagonalMayorR, 2) + Math.pow(diagonalMenorR, 2));
        return perimetroRombo;
    }
    //Diagonal
    public double getDiagonalRombo() {
        diagonalRombo = Math.sqrt( 4 * Math.pow(ladosRombo, 2) - Math.pow(diagonalMayorR, 2));
        return diagonalRombo;
    }

    public void setDiagonalMayorR(float diagonalMayorR) {
        this.diagonalMayorR = diagonalMayorR;
    }

    public void setDiagonalMenorR(float diagonalMenorR) {
        this.diagonalMenorR = diagonalMenorR;
    }

    public void setLadosRombo(float ladosRombo) {
        this.ladosRombo = ladosRombo;
    }
}

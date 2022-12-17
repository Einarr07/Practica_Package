package Geometria2D;

public class Heptagono {
    //Atributos
    public float longitudHeptagono, apotemaHeptagono, ladosHeptagonos;
    public float areaHeptagono, perimetroHeptagono, diagonalHeptagono;
    //Constructor
    public Heptagono(){
        longitudHeptagono = 0;
        apotemaHeptagono = 0;
        ladosHeptagonos = 7;
        areaHeptagono = 0;
        perimetroHeptagono = 0;
        diagonalHeptagono = 0;
    }
    //Area
    public float getAreaHeptagono() {
        areaHeptagono = (7 * longitudHeptagono * apotemaHeptagono) / 2;
        return areaHeptagono;
    }
    //Perimetro
    public float getPerimetroHeptagono() {
        perimetroHeptagono = 7 * longitudHeptagono;
        return perimetroHeptagono;
    }
    //Diagonal
    public float getDiagonalHeptagono() {
        diagonalHeptagono = (ladosHeptagonos * (ladosHeptagonos - 3) / 2);
        return diagonalHeptagono;
    }

    public void setLongitudHeptagono(float longitudHeptagono) {
        this.longitudHeptagono = longitudHeptagono;
    }

    public void setApotemaHeptagono(float apotemaHeptagono) {
        this.apotemaHeptagono = apotemaHeptagono;
    }
}

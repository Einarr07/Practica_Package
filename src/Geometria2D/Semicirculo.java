package Geometria2D;

public class Semicirculo {
    //Atributos
    public float radioSemi;
    public double areaSemi, perimetroSemi, alturaCentroide;
    //Constructor
    public Semicirculo(){
        radioSemi = 0;
        areaSemi = 0;
        perimetroSemi = 0;
        alturaCentroide = 0;
    }
    //Area
    public double getAreaSemi() {
        final double pi = 3.1416;
        areaSemi = (pi * Math.pow(radioSemi, 2) ) / 2;
        return areaSemi;
    }
    //Permietro
    public double getPerimetroSemi() {
        final double pi = 3.1416;
        perimetroSemi = (pi * radioSemi) + (2 * radioSemi);
        return perimetroSemi;
    }
    //Altura Centroide
    public double getAlturaCentroide() {
        final double pi = 3.1416;
        alturaCentroide = (4 * radioSemi) / (3 * pi);
        return alturaCentroide;
    }

    public void setRadioSemi(float radioSemi) {
        this.radioSemi = radioSemi;
    }
}

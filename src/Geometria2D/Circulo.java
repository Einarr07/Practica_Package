package Geometria2D;

public class Circulo {
    //Atributos
    public float radioCirculo;
    public double areaCirculo, perimetroCirculo, diagonalCirculo;
    //Constructor
    public Circulo(){
        radioCirculo = 0;
        areaCirculo = 0;
        perimetroCirculo = 0;
        diagonalCirculo = 0;
    }
    //Area
    public double getAreaCirculo() {
        final double pi = 3.1416;
        areaCirculo = pi * Math.pow(radioCirculo, 2);
        return areaCirculo;
    }
    //Perimetro
    public double getPerimetroCirculo() {
        final double pi = 3.1416;
        perimetroCirculo = 2 * pi * radioCirculo;
        return perimetroCirculo;
    }
    //Longitud
    public double getDiagonalCirculo() {
        final double pi = 3.1416;
        diagonalCirculo = radioCirculo * pi;
        return diagonalCirculo;
    }

    public void setRadioCirculo(float radioCirculo) {
        this.radioCirculo = radioCirculo;
    }
}

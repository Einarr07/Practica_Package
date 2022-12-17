package Geometria2D;

public class Trapecio {
    //Atributos
    public float baseMenorTrapecio, baseMayorTrapecio, alturaTrapecio, ladoIzTrapecio, ladoDrTrapecio,
            anguloTrapecio;
    public float areaTrapecio, perimetroTrapecio;
    public double diagonalTrapecio;
    //Constructor
    public Trapecio(){
        baseMayorTrapecio = 0;
        baseMenorTrapecio = 0;
        ladoIzTrapecio = 0;
        ladoDrTrapecio = 0;
        alturaTrapecio = 0;
        areaTrapecio = 0;
        perimetroTrapecio = 0;
        diagonalTrapecio = 0;
    }
    //Area
    public float getAreaTrapecio() {
        areaTrapecio = ((baseMayorTrapecio + baseMenorTrapecio) / 2) * alturaTrapecio;
        return areaTrapecio;
    }
    //Perimetro
    public float getPerimetroTrapecio() {
        perimetroTrapecio = baseMayorTrapecio + baseMenorTrapecio + ladoIzTrapecio + ladoDrTrapecio;
        return perimetroTrapecio;
    }
    //Diagonal
    public double getDiagonaTrapecio() {
        diagonalTrapecio = Math.sqrt((Math.pow(baseMayorTrapecio, 2) + Math.pow(ladoDrTrapecio, 2)) -(2 *
                (baseMayorTrapecio * ladoDrTrapecio)) * Math.cos(anguloTrapecio));
        return diagonalTrapecio;
    }

    public void setBaseMenorTrapecio(float baseMenorTrapecio) {
        this.baseMenorTrapecio = baseMenorTrapecio;
    }

    public void setBaseMayorTrapecio(float baseMayorTrapecio) {
        this.baseMayorTrapecio = baseMayorTrapecio;
    }

    public void setAlturaTrapecio(float alturaTrapecio) {
        this.alturaTrapecio = alturaTrapecio;
    }

    public void setLadoIzTrapecio(float ladoIzTrapecio) {
        this.ladoIzTrapecio = ladoIzTrapecio;
    }

    public void setLadoDrTrapecio(float ladoDrTrapecio) {
        this.ladoDrTrapecio = ladoDrTrapecio;
    }

    public void setAnguloTrapecio(float anguloTrapecio) {
        this.anguloTrapecio = anguloTrapecio;
    }
}

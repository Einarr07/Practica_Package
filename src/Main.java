import Geometria3D.Esfera;
import Geometria3D.Cilindro;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Esfera figura3d = new Esfera();
        Cilindro figura3dC = new Cilindro();
        System.out.println("Volumen: " + figura3d.calVolumen(figura3d));
        System.out.println("Diametro: " + figura3d.caldiametro(figura3d));

        System.out.println("Volumen: " + figura3dC.calVolumen(figura3dC));


    }
}
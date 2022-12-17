import Geometria3D. *;
public class Main {
    public static void main(String[] args) {

        //Esfera figura3dE = new Esfera();
        //Cilindro figura3dC = new Cilindro();
        //Tetraedro figura3dT = new Tetraedro();
        //Rectangulo figura3dR = new Rectangulo();
        //Octaedro figura3dO = new Octaedro();
        //piramideCuadrangular figura3dP = new piramideCuadrangular();
        //Cubo figura3dCu = new Cubo();
        //prismaRectangular figura3dPT = new prismaRectangular();
        //prismaHexagonal figura3dPH = new prismaHexagonal();
        //Cono figura3dCo = new Cono();

        System.out.println("ESFERA");
        Esfera figura3dE = new Esfera();
        System.out.println("Volumen ESFERA: " + figura3dE.calVolumen(figura3dE));
        System.out.println("Diametro: " + figura3dE.caldiametro(figura3dE));
        System.out.println("Volumen casquete: " + figura3dE.calcasquete(figura3dE));

        System.out.println("CILINDRO");
        Cilindro figura3dC = new Cilindro();
        System.out.println("Volumen CILINDRO: " + figura3dC.calVolumen(figura3dC));
        System.out.println("Superficie lateral: " + figura3dC.calAreaLateral(figura3dC));
        System.out.println("Superficie total " + figura3dC.calAreaTotal(figura3dC));

        System.out.println("TETRAEDRO");
        Tetraedro figura3dT = new Tetraedro();
        System.out.println("Volumen TETRAEDRO: " + figura3dT.calVolumen(figura3dT));
        System.out.println("Altura: " + figura3dT.calAltura(figura3dT));
        System.out.println("Superficie total " + figura3dT.calAreaTotal(figura3dT));

        System.out.println("RECTANGULO");
        Rectangulo figura3dR = new Rectangulo();
        System.out.println("Volumen RECTANGULO: " + figura3dR.calVolumen(figura3dR));
        System.out.println("Superficie lateral: " + figura3dR.calAreaLateral(figura3dR));
        System.out.println("Superficie total " + figura3dR.calAreaTotal(figura3dR));

        System.out.println("OCTAEDRO");
        Octaedro figura3dO = new Octaedro();
        System.out.println("Volumen OCTAEDRO: " + figura3dO.calVolumen(figura3dO));
        System.out.println("Altura: " + figura3dO.calAltura(figura3dO));
        System.out.println("Superficie total " + figura3dO.calAreaTotal(figura3dO));

        System.out.println("PIRAMIDE CUADRANGULAR");
        piramideCuadrangular figura3dP = new piramideCuadrangular();
        System.out.println("Volumen PIRAMIDE CUADRANGULAR: " + figura3dP.calVolumen(figura3dP));
        System.out.println("Apotema: " + figura3dP.calApotema(figura3dP));
        System.out.println("Area de la base: " + figura3dP.calAreaBase(figura3dP));

        System.out.println("PRISMA TRIANGULAR");
        prismaRectangular figura3dPT = new prismaRectangular();
        System.out.println("Volumen PIRAMIDE CUADRANGULAR: " + figura3dPT.calVolumen(figura3dPT));
        System.out.println("Apotema: " + figura3dPT.calAreaLateral(figura3dPT));
        System.out.println("Area de la base: " + figura3dPT.calAreaTotal(figura3dPT));

        System.out.println("CUBO");
        Cubo figura3dCu = new Cubo();
        System.out.println("Volumen CUBO: " + figura3dCu.calVolumen(figura3dCu));
        System.out.println("Area lateral: " + figura3dCu.calAreaLateral(figura3dCu));
        System.out.println("Area total: " + figura3dCu.calAreaTotal(figura3dCu));

        System.out.println("PRISMA HEXAGONAL");
        prismaHexagonal figura3dPH = new prismaHexagonal();
        System.out.println("Volumen PRISMA TRIANGULAR: " + figura3dPH.calVolumen(figura3dPH));
        System.out.println("Apotema: " + figura3dPH.calApotema(figura3dPH));
        System.out.println("Superficie total " + figura3dPH.calAreaTotal(figura3dPH));

        System.out.println("CONO");
        Cono figura3dCo = new Cono();
        System.out.println("Volumen CONO: " + figura3dCo.calVolumen(figura3dCo));
        System.out.println("Altura inclinada: " + figura3dCo.calAlturaInclinada(figura3dCo));
        System.out.println("Superficie total " + figura3dCo.calAreaTotal(figura3dCo));
    }
}
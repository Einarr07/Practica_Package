import Geometria3D. *;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        DecimalFormat df= new DecimalFormat("#.00");
        Menu3d menu_de_figuras3d = new Menu3d();
        int op3d = menu_de_figuras3d.menu_figuras3d();

        while (op3d != 0){
            switch (op3d){
                case 1: //Caso para calcular las careas
                    System.out.println("********** CILINDRO **********");
                    Cilindro figura3dC = new Cilindro();
                    System.out.println("Volumen CILINDRO: " + df.format(figura3dC.calVolumen(figura3dC)));
                    System.out.println("Superficie lateral: " + df.format(figura3dC.calAreaLateral(figura3dC)));
                    System.out.println("Superficie total " + df.format(figura3dC.calAreaTotal(figura3dC)));
                    break;
                case 2: //Caso para calcular los perimetros
                    System.out.println("********** ESFERA **********");
                    Esfera figura3dE = new Esfera();
                    System.out.println("Volumen ESFERA: " + df.format(figura3dE.calVolumen(figura3dE)));
                    System.out.println("Diametro: " + df.format(figura3dE.caldiametro(figura3dE)));
                    System.out.println("Volumen casquete: " + df.format(figura3dE.calcasquete(figura3dE)));
                    break;
                case 3: //Caso para calcular las diagonales
                    System.out.println("********** CONO **********");
                    Cono figura3dCo = new Cono();
                    System.out.println("Volumen CONO: " + df.format(figura3dCo.calVolumen(figura3dCo)));
                    System.out.println("Altura inclinada: " + df.format(figura3dCo.calAlturaInclinada(figura3dCo)));
                    System.out.println("Superficie total " + df.format(figura3dCo.calAreaTotal(figura3dCo)));
                    break;
                case 4:
                    System.out.println("********** CUBO **********");
                    Cubo figura3dCu = new Cubo();
                    System.out.println("Volumen CUBO: " + df.format(figura3dCu.calVolumen(figura3dCu)));
                    System.out.println("Area lateral: " + df.format(figura3dCu.calAreaLateral(figura3dCu)));
                    System.out.println("Area total: " + df.format(figura3dCu.calAreaTotal(figura3dCu)));
                    break;
                case 5:
                    System.out.println("********** OCTAEDRO **********");
                    Octaedro figura3dO = new Octaedro();
                    System.out.println("Volumen OCTAEDRO: " + df.format(figura3dO.calVolumen(figura3dO)));
                    System.out.println("Altura: " + df.format(figura3dO.calAltura(figura3dO)));
                    System.out.println("Superficie total " + df.format(figura3dO.calAreaTotal(figura3dO)));
                    break;
                case 6:
                    System.out.println("********** PIRAMIDE CUADRANGULAR **********");
                    piramideCuadrangular figura3dP = new piramideCuadrangular();
                    System.out.println("Volumen PIRAMIDE CUADRANGULAR: " + df.format(figura3dP.calVolumen(figura3dP)));
                    System.out.println("Apotema: " + df.format(figura3dP.calApotema(figura3dP)));
                    System.out.println("Area de la base: " + df.format(figura3dP.calAreaBase(figura3dP)));
                    break;
                case 7:
                    System.out.println("********** PRISMA HEXAGONAL **********");
                    prismaHexagonal figura3dPH = new prismaHexagonal();
                    System.out.println("Volumen PRISMA TRIANGULAR: " + df.format(figura3dPH.calVolumen(figura3dPH)));
                    System.out.println("Apotema: " + df.format(figura3dPH.calApotema(figura3dPH)));
                    System.out.println("Superficie total " + df.format(figura3dPH.calAreaTotal(figura3dPH)));
                    break;
                case 8:
                    System.out.println("********** PRISMA TRIANGULAR **********");
                    prismaRectangular figura3dPT = new prismaRectangular();
                    System.out.println("Volumen PIRAMIDE CUADRANGULAR: " + df.format(figura3dPT.calVolumen(figura3dPT)));
                    System.out.println("Apotema: " + df.format(figura3dPT.calAreaLateral(figura3dPT)));
                    System.out.println("Area de la base: " + df.format(figura3dPT.calAreaTotal(figura3dPT)));
                    break;
                case 9:
                    System.out.println("********** RECTANGULO **********");
                    Rectangulo figura3dR = new Rectangulo();
                    System.out.println("Volumen RECTANGULO: " + df.format(figura3dR.calVolumen(figura3dR)));
                    System.out.println("Superficie lateral: " + df.format(figura3dR.calAreaLateral(figura3dR)));
                    System.out.println("Superficie total " + df.format(figura3dR.calAreaTotal(figura3dR)));
                    break;
                case 10:
                    System.out.println("********** TETRAEDRO **********");
                    Tetraedro figura3dT = new Tetraedro();
                    System.out.println("Volumen TETRAEDRO: " + df.format(figura3dT.calVolumen(figura3dT)));
                    System.out.println("Altura: " + df.format(figura3dT.calAltura(figura3dT)));
                    System.out.println("Superficie total " + df.format(figura3dT.calAreaTotal(figura3dT)));
                    break;
                default:
                    System.out.println("-------------------------");
                    System.out.println("| GRACIAS, VUELVA PRONTO |");
                    System.out.println("-------------------------");
            }//Fin switch
            op3d = menu_de_figuras3d.menu_figuras3d();
        }//Fin while
    }
}
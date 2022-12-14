import Geometria2D.*;
import Geometria2D.Rectangulo;
import Geometria3D.*;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        //Instancias 2d
        Cuadrado cuadrado1 = new Cuadrado(); //Cuadrado
        Triangulo triangulo1 = new Triangulo(); //Triangulo
        Rectangulo rectangulo1 = new Rectangulo(); //Rectangulo
        Circulo circulo1 = new Circulo(); //Circulo
        Heptagono heptagono1 = new Heptagono(); //Heptagono
        Hexagono hexagono1 = new Hexagono(); //Hexagono
        Pentagono pentagono1 = new Pentagono(); //Pentagono
        Rombo rombo1 = new Rombo(); //Rombo
        Semicirculo semi1 = new Semicirculo(); //Semicirculo
        Trapecio trapecio1 = new Trapecio(); //Trapecio
        Scanner entrada = new Scanner(System.in);
        //Menu
        Menus menu_de_figuras = new Menus();
        Menus menu_de_opciones = new Menus();
        //Variables
        float base = 0, altura = 0, lados = 0, radio = 0, longitud = 0, apotema = 0, diagonalMayor = 0,
                diagonaMenor = 0, angulo = 0;
        int op_figuras = 0;
        boolean salir = false;
        while (!salir) {
            switch (menu_de_opciones.menu()) {
                case 1: //Caso para calcular las careas
                    op_figuras = menu_de_figuras.menu_figuras();
                    if (op_figuras == 1) {
                        System.out.println("Ingrese las dimenciones del cuadrado");
                        cuadrado1.setAlturaCuadrado(altura = entrada.nextFloat());
                        System.out.println("El area del cuadrado es: " + cuadrado1.getAreaCuadrado());
                    } else if (op_figuras == 2) {
                        System.out.println("Ingrese la base del triangulo");
                        triangulo1.setBaseTriangulo(base = entrada.nextFloat());
                        System.out.println("Ingrese la altura del triangulo");
                        triangulo1.setAlturaTriangulo(altura = entrada.nextFloat());
                        System.out.println("El area del triangulo es: " + triangulo1.getAreaTriangulo());
                    } else if (op_figuras == 3) {
                        System.out.println("Ingrese la base del rectangulo");
                        rectangulo1.setBaseRectangulo(base = entrada.nextFloat());
                        System.out.println("Ingrese la altura del rectangulo");
                        rectangulo1.setAlturaRectangulo(altura = entrada.nextFloat());
                        System.out.println("El area del tectangulo es: " + rectangulo1.getAreaRectangulo());
                    } else if (op_figuras == 4) {
                        System.out.println("Ingrese el radio del circulo");
                        circulo1.setRadioCirculo(radio = entrada.nextFloat());
                        System.out.println("El area del circulo es: " + circulo1.getAreaCirculo());
                    } else if (op_figuras == 5) {
                        System.out.println("Heptagono regular");
                        System.out.println("Ingrese la longitud del heptagono");
                        heptagono1.setLongitudHeptagono(longitud = entrada.nextFloat());
                        System.out.println("Ingrese la aoptema del heptagono");
                        heptagono1.setApotemaHeptagono(apotema = entrada.nextFloat());
                        System.out.println("El area del heptagono: " + heptagono1.getAreaHeptagono());
                    } else if (op_figuras == 6) {
                        System.out.println("Hexagono regular");
                        System.out.println("Ingrese la longitud del hexagono");
                        hexagono1.setLongitudHexagono(longitud = entrada.nextFloat());
                        System.out.println("Ingrese el apotema del hexagono");
                        hexagono1.setApotemaHexagono(apotema = entrada.nextFloat());
                        System.out.println("El area del hexagono es: " + hexagono1.getAreaHexagono());
                    } else if (op_figuras == 7) {
                        System.out.println("Ingrese la longitud del pentagono");
                        pentagono1.setLongitudPentagono(longitud = entrada.nextFloat());
                        System.out.println("Ingrese el apotema del pentagono");
                        pentagono1.setApotemaPentagono(apotema = entrada.nextFloat());
                        System.out.println("El area del pentagono es: " + pentagono1.getAreaPentagono());
                    } else if (op_figuras == 8) {
                        System.out.println("Ingrese la diagonal mayor del rombo");
                        rombo1.setDiagonalMayorR(diagonalMayor = entrada.nextFloat());
                        System.out.println("Ingrese la diagonal menor del rombo");
                        rombo1.setDiagonalMenorR(diagonaMenor = entrada.nextFloat());
                        System.out.println("El area del rombo es: " + rombo1.getAreaRombo());
                    } else if (op_figuras == 9) {
                        System.out.println("Ingrese el radio del semi circulo");
                        semi1.setRadioSemi(radio = entrada.nextFloat());
                        System.out.println("El area del semicirculo es: " + semi1.getAreaSemi());
                    } else if (op_figuras == 10) {
                        System.out.println("Ingrese la base MAYOR del trapecio");
                        trapecio1.setBaseMayorTrapecio(base = entrada.nextFloat());
                        System.out.println("Ingrese la base MENOR del trapecio");
                        trapecio1.setBaseMenorTrapecio(base = entrada.nextFloat());
                        System.out.println("Ingrese la alguta del trapecio");
                        trapecio1.setAlturaTrapecio(altura = entrada.nextFloat());
                        System.out.println("El area del trapecio es: " + trapecio1.getAreaTrapecio());
                    }
                    break;
                case 2: //Caso para calcular los perimetros
                    op_figuras = menu_de_figuras.menu_figuras();
                    if (op_figuras == 1) {
                        System.out.println("Ingrese las dimensiones del cuadrado");
                        cuadrado1.setAlturaCuadrado(altura = entrada.nextFloat());
                        System.out.println("El perimetro del cuadrado es: " + cuadrado1.getPerimetroCuadrado());
                    } else if (op_figuras == 2) {
                        System.out.println("Ingrese la base del triangulo");
                        triangulo1.setBaseTriangulo(base = entrada.nextFloat());
                        System.out.println("Ingrese el lado del triangulo");
                        triangulo1.setLadosTriangulo(lados = entrada.nextFloat());
                        System.out.println("El perimetro del triangulo es: " + triangulo1.getPerimetroTriangulo());
                    } else if (op_figuras == 3) {
                        System.out.println("Ingrese la base del rectangulo");
                        rectangulo1.setBaseRectangulo(base = entrada.nextFloat());
                        System.out.println("Ingrese la altura del rectangulo");
                        rectangulo1.setAlturaRectangulo(altura = entrada.nextFloat());
                        System.out.println("El area del tectangulo es: " + rectangulo1.getPerimetroRectangulo());
                    } else if (op_figuras == 4) {
                        System.out.println("Ingrese el radio del circulo");
                        circulo1.setRadioCirculo(radio = entrada.nextFloat());
                        System.out.println("El area del circulo es: " + circulo1.getPerimetroCirculo());
                    } else if (op_figuras == 5) {
                        System.out.println("Heptagono regular");
                        System.out.println("Ingrese la longitud del heptagono");
                        heptagono1.setLongitudHeptagono(longitud = entrada.nextFloat());
                        System.out.println("El perimetro del heptagono es: " + heptagono1.getPerimetroHeptagono());
                    } else if (op_figuras == 6) {
                        System.out.println("Hexagono regular");
                        System.out.println("Ingrese la longitud del hexagono");
                        hexagono1.setLongitudHexagono(longitud = entrada.nextFloat());
                        System.out.println("El perimetro del hexagono es: " + hexagono1.getPerimetroHexagono());
                    } else if (op_figuras == 7) {
                        System.out.println("Ingrese la longitud del pentagono");
                        pentagono1.setLongitudPentagono(longitud = entrada.nextFloat());
                        System.out.println("El perimetro del pentagono es: " +
                                pentagono1.getPerimetroPentagono());
                    } else if (op_figuras == 8) {
                        System.out.println("Ingrese la diagonal mayor del rombo");
                        rombo1.setDiagonalMayorR(diagonalMayor = entrada.nextFloat());
                        System.out.println("Ingrese la diagonal menor del rombo");
                        rombo1.setDiagonalMenorR(diagonaMenor = entrada.nextFloat());
                        System.out.println("El perimetro del rombo es: " + rombo1.getPerimetroRombo());
                    } else if (op_figuras == 9) {
                        System.out.println("Ingrese el radio del semi circulo");
                        semi1.setRadioSemi(radio = entrada.nextFloat());
                        System.out.println("El perimetro del semicirculo es: " + semi1.getPerimetroSemi());
                    } else if (op_figuras == 10) {
                        System.out.println("Ingrese la base MAYOR del trapecio");
                        trapecio1.setBaseMayorTrapecio(base = entrada.nextFloat());
                        System.out.println("Ingrese la base MENOR del trapecio");
                        trapecio1.setBaseMenorTrapecio(base = entrada.nextFloat());
                        System.out.println("Ingrese el lado Izquiero del trapecio");
                        trapecio1.setLadoIzTrapecio(lados = entrada.nextFloat());
                        System.out.println("Ingrese el lado derecho del trapecio");
                        trapecio1.setLadoDrTrapecio(lados = entrada.nextFloat());
                        System.out.println("El area del trapecio es: " + trapecio1.getPerimetroTrapecio());
                    }
                    break;
                case 3: //Caso para calcular las diagonales
                    op_figuras = menu_de_figuras.menu_figuras();
                    if (op_figuras == 1) {
                        System.out.println("Ingrese las dimenciones del cuadrado");
                        cuadrado1.setAlturaCuadrado(altura = entrada.nextFloat());
                        System.out.println("La diagonal del cuadrado es: " + cuadrado1.getDiagonalCuadrado());
                    } else if (op_figuras == 2) {
                        System.out.println("Triangulo rectangulo");
                        System.out.println("Ingrese la base del triangulo");
                        triangulo1.setBaseTriangulo(base = entrada.nextFloat());
                        System.out.println("Ingrese la altura del triangulo");
                        triangulo1.setAlturaTriangulo(altura = entrada.nextFloat());
                        System.out.println("La hipotenusa del triangulo es: " + triangulo1.getDiagonalTriangulo());
                    } else if (op_figuras == 3) {
                        System.out.println("Ingrese la base del rectangulo");
                        rectangulo1.setBaseRectangulo(base = entrada.nextFloat());
                        System.out.println("Ingrese la altura del triangulo");
                        rectangulo1.setAlturaRectangulo(altura = entrada.nextFloat());
                        System.out.println("La diagonal del rectangulo es: " + rectangulo1.getDiagonalRectangulo());
                    } else if (op_figuras == 4) {
                        System.out.println("Ingrese el diametro de la circunferencia");
                        circulo1.setRadioCirculo(radio = entrada.nextFloat());
                        System.out.println("La longitud de la circunferencia es: " + circulo1.getDiagonalCirculo());
                    } else if (op_figuras == 5) {
                        System.out.println("Cantidad de diagonales que tiene un heptagono");
                        System.out.println("La cantidad de diagonales de un heptagono es: " +
                                heptagono1.getDiagonalHeptagono());
                    } else if (op_figuras == 6) {
                        System.out.println("Cantidad de diagonales que tiene un hexagono");
                        System.out.println("La cantidad de diagonales de un hexagono es: " +
                                hexagono1.getDiagonalHexagono());
                    } else if (op_figuras == 7) {
                        System.out.println("Cantidad de diagonales que tiene un pentagono");
                        System.out.println("La cantidad de diagonales de un pentagono es: " +
                                pentagono1.getDiagonalPentagono());
                    } else if (op_figuras == 8) {
                        System.out.println("Calgular la diagonal menor de un Rombo");
                        System.out.println("Ingrese la diagonal mayor");
                        rombo1.setDiagonalMayorR(diagonalMayor = entrada.nextFloat());
                        System.out.println("Ingrese el valor de los lados del rombo");
                        rombo1.setLadosRombo(lados = entrada.nextFloat());
                        System.out.println("La diagonal menor es: " + rombo1.getDiagonalRombo());
                    } else if (op_figuras == 9) {
                        System.out.println("Determinar el centroide de un semicirculo");
                        System.out.println("Ingrese el radio del semi circulo");
                        semi1.setRadioSemi(radio = entrada.nextFloat());
                        System.out.println("La altura del centroide es: " + semi1.getAlturaCentroide());
                    } else if (op_figuras == 10) {
                        System.out.println("Calcular la longitud de las diagonales con la ley de cosenos");
                        System.out.println("Ingrese la base MAYOR del trapecio");
                        trapecio1.setBaseMayorTrapecio(base = entrada.nextFloat());
                        System.out.println("Ingrese una longitud lateral");
                        trapecio1.setLadoDrTrapecio(lados = entrada.nextFloat());
                        System.out.println("Ingrese el angulo del trapecio");
                        trapecio1.setAnguloTrapecio(angulo = entrada.nextFloat());
                        System.out.println("Longitud de la diagonal es: " + trapecio1.getDiagonaTrapecio());
                    }
                    break;
                case 4: //Caso para salir del menu
                    salir = true;
                    break;
                default:
                    System.out.println("-------------------");
                    System.out.println("| OPCION NO VALIDA|");
                    System.out.println("-------------------");
            }//Fin switch
        }//Fin while
        System.out.println("-------------------------");
        System.out.println("| GRACIAS, VUELVA PRONTO |");
        System.out.println("-------------------------");

        //CODIGO DE FIGURAS GEOM??TRICAS 3D
        DecimalFormat df = new DecimalFormat("#.00");
        Menu3d menu_de_figuras3d = new Menu3d();
        int op3d = menu_de_figuras3d.menu_figuras3d();
        while (op3d != 0) {
            switch (op3d) {
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
                    Geometria3D.Rectangulo figura3dR = new Geometria3D.Rectangulo();
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
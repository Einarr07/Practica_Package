import Geometria2D.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Instancias
        Cuadrado cuadrado1 = new Cuadrado(); //Cuadrado
        Triangulo triangulo1 = new Triangulo(); //Triangulo
        Scanner entrada = new Scanner(System.in);
        //Menu
        Menus menu_de_figuras = new Menus();
        Menus menu_de_opciones = new Menus();
        //Variables
        float base = 0, altura = 0;
        int op_figuras = 0;
        boolean salir = false;
        while (!salir){
            switch (menu_de_opciones.menu()){
                case 1: //Caso para calcular las careas
                    op_figuras = menu_de_figuras.menu_figuras();
                    if (op_figuras == 1){
                        System.out.println("Ingrese la base del cuadrado");
                        cuadrado1.setBaseCuadrado(base = entrada.nextFloat());
                        System.out.println("Ingrese la altura del cuadrado");
                        cuadrado1.setAlturaCuadrado(altura = entrada.nextFloat());
                        System.out.println("El area del cuadrado es: " + cuadrado1.getAreaCuadrado());
                    }
                    else if (op_figuras == 2) {
                        System.out.println("Ingrese la base del triangulo");
                        triangulo1.setBaseTriangulo(base = entrada.nextFloat());
                        System.out.println("Ingrese la altura del triangulo");
                        triangulo1.setAlturaTriangulo(altura = entrada.nextFloat());
                        System.out.println("El area del triangulo es: " + triangulo1.getAreaTriangulo());

                    }
                    else if (op_figuras == 3){

                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
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
    }
}
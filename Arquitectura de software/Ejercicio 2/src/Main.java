import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Escaners para datos ingresados por teclado
        Scanner opMenu = new Scanner(System.in);
        Scanner opMenu2 = new Scanner(System.in);

        //Inicializacion de las variables de escaner
        int opcionMenu = 0;
        int opcionMenu2 = 0;

        double lado = 0;
        double catop = 0;
        double catad = 0;
        double rad = 0;

        //Menu de la biblioteca
        while (opcionMenu != 3) {
            try {
                System.out.println("");
                System.out.println("* Elija una opción *");
                System.out.println("");
                System.out.println("1.- Introducir Figura");
                System.out.println("2.- Calcular area");
                System.out.println("3.- Salir");
                System.out.println("");
                System.out.print("¿Que accion desea realizar? : ");

                opcionMenu = opMenu.nextInt();
                switch (opcionMenu) {
                    case 1:
                        System.out.println("");
                        System.out.println("* Elija una opción *");
                        System.out.println("");
                        System.out.println("1.- Cuadrado");
                        System.out.println("2.- Triangulo rectángulo");
                        System.out.println("3.- Circulo");
                        System.out.println("4.- Salir");
                        System.out.println("");
                        System.out.print("¿Que accion desea realizar? : ");

                        opcionMenu2 = opMenu2.nextInt();
                        switch (opcionMenu2){
                            case 1:
                                System.out.println("Ingresar el valor del lado");
                                Scanner la = new Scanner(System.in);
                                lado = la.nextInt();
                            case 4:
                                break;
                            case 2:
                                System.out.println("Ingresar el valor del cateto opuesto");
                                Scanner cato = new Scanner(System.in);
                                catop = cato.nextInt();

                                System.out.println("Ingresar el valor del cateto adyacente");
                                Scanner cata = new Scanner(System.in);
                                catad = cata.nextInt();
                            case 5:
                                break;
                            case 3:
                                System.out.println("Ingresar el valor del radio");
                                Scanner ra = new Scanner(System.in);
                                rad = ra.nextInt();
                            case 6:
                                break;
                        }
                        break;
                    case 2:

                    case 3:
                        System.out.println("");
                        System.out.println("Hasta la proxima");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
}
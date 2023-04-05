import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Escaners para datos ingresados por teclado
        Scanner opMenu = new Scanner(System.in);

        //Inicializacion de las variables de escaner
        int opcionMenu = '0';

        String nombre;
        int edad;
        int getSalario = 0;
        String cargo;
        CalculoImpuesto calculoImpuesto = null;


        //Menu de la biblioteca
        while (opcionMenu != 3) {
            try {
                System.out.println("");
                System.out.println("* Elija una opción *");
                System.out.println("");
                System.out.println("1.- Introducir empleado");
                System.out.println("2.- Calcular el iva");
                System.out.println("3.- Salir");
                System.out.println("");
                System.out.print("¿Que accion desea realizar? : ");

                opcionMenu = opMenu.nextInt();
                switch (opcionMenu) {
                    case 1:
                        System.out.println("Ingrese el nombre: ");
                        Scanner nomb = new Scanner(System.in);
                        nombre = nomb.nextLine();

                        System.out.println("Ingrese la edad");
                        Scanner ed = new Scanner(System.in);
                        edad = ed.nextInt();

                        System.out.println("Ingrese el salario");
                        Scanner sal = new Scanner(System.in);
                        getSalario = sal.nextInt();

                        System.out.println("Ingrese el cargo");
                        Scanner carg = new Scanner(System.in);
                        cargo = carg.nextLine();
                        Empleado empleado = new Empleado(nombre, edad, getSalario, cargo);
                        break;
                    case 2:
                        CalculoImpuesto impuesto = new CalculoImpuesto();
                        System.out.print("El IVA obtenido es: ");
                        System.out.println(impuesto.calcularImpuesto(getSalario) + " BS");

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
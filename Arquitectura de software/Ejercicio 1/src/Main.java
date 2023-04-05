import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Escaners para datos ingresados por teclado
        Scanner opMenu = new Scanner(System.in);

        //Inicializacion de las variables de escaner
        int opcionMenu = '0';

        String nombre = null;
        int edad = 0;
        int Salario = 0;
        String cargo = "";
        ArrayList<Empleado> empleados = new ArrayList<>();
        CalculoImpuesto calculoImpuesto = new CalculoImpuesto(0.13);

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
                        Salario = sal.nextInt();

                        System.out.println("Ingrese el cargo");
                        Scanner carg = new Scanner(System.in);
                        cargo = carg.nextLine();
                        Empleado empleado = new Empleado(nombre, edad, Salario, cargo);
                        empleados.add(empleado);
                        break;
                    case 2:
                        if (empleados.isEmpty()) {
                            System.out.println("No hay empleados registrados");
                        } else {
                            System.out.println("Impuestos a pagar por empleado:");
                            for (Empleado e : empleados) {
                                double impu = calculoImpuesto.calcularImpuesto(e.getSalario());
                                System.out.println(e.getNombre() + ": $" + impu);
                            }
                        }
                        break;

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
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int ValorA = 0;
        int ValorB = 0;
        int ValorN = 0;
        int Valorcant = 0;

        int opcionMenu = 0;

        while (opcionMenu != 4)
            try{
                System.out.println("1. Sumar");
                System.out.println("2. Sumatoria");
                System.out.println("3. Suma elementos");
                System.out.println("4. Salir");
                opcionMenu = num.nextInt();
                switch (opcionMenu){
                    case 1:
                        int[] elementos = new int[2];

                        System.out.println("Ingrese el valor de A: ");
                        ValorA = num.nextInt();
                        elementos[0] = ValorA;

                        System.out.println("Ingrese el valor de B: ");
                        ValorB = num.nextInt();
                        elementos[1] = ValorB;
                        IoperacionesMatematicas operaciones = new SumaAdapter();
                        operaciones.sumaelementos(elementos);
                        break;
                    case 2:
                        elementos = new int[1];
                        System.out.println("Ingrese el valor de N: ");
                        ValorN = num.nextInt();
                        elementos[0] = ValorN;

                        operaciones = new SumatoriaAdapter();
                        operaciones.sumaelementos(elementos);
                        break;
                    case 3:
                        System.out.println("Ingrese la cantidad de numeros a sumar");
                        Valorcant = num.nextInt();
                        elementos = new int[Valorcant];

                        for (int i = 0; i < Valorcant; i++) {
                            System.out.print("Ingrese el número #" + (i+1) + ": ");
                            elementos[i] = num.nextInt();
                        }

                        operaciones = new OperacionesMatematicas();
                        operaciones.sumaelementos(elementos);
                        break;
                    case 4:
                        System.out.println("Hasta la proxima");
                        break;
                }
            }catch (Exception e){
                System.out.println("Error");
            }
    }
}



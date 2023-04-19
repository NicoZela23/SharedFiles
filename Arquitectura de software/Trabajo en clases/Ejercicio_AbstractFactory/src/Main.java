import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner valor = new Scanner(System.in);

            String Mam = "";
            String Ave = "";
            String Pez = "";

            int opcionMenu = 0;

            while (opcionMenu != 8)
                try{
                    System.out.println("1. Añadir Mamifero");
                    System.out.println("2. Añadir Ave");
                    System.out.println("3. Añadir Pez");
                    System.out.println("4. Mostrar Mamifero");
                    System.out.println("5. Mostrar Ave");
                    System.out.println("6. Mostrar Peces");
                    System.out.println("7. Mostrar Zoologico");
                    System.out.println("8. Salir");
                    opcionMenu = valor.nextInt();
                    switch (opcionMenu){
                        case 1:
                            System.out.println("Ingrese el mamifero de su preferencia: ");
                            Mam = valor.nextLine();
                            IFabricaAbstracta fabricaMamifero = FabricaProductor.getFactory("Mamifero");
                            IMamiferos mamifero = fabricaMamifero.getMamifero(Mam);
                            break;
                        case 2:
                            System.out.println("Ingrese el Ave de su preferencia: ");
                            Ave = valor.nextLine();
                            IFabricaAbstracta fabricaAves = FabricaProductor.getFactory("Ave");
                            IAves aves = fabricaAves.getAve(Ave);
                            break;
                        case 3:
                            System.out.println("Ingrese el Pez de su preferencia: ");
                            Pez = valor.nextLine();
                            IFabricaAbstracta fabricaPeces = FabricaProductor.getFactory("Pez");
                            IPeces peces = fabricaPeces.getPez(Pez);
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            System.out.println("Hasta la proxima");
                            break;
                    }
                }catch (Exception e){
                    System.out.println("Error");
                }
        }
}
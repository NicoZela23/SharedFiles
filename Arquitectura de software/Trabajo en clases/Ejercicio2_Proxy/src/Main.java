import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);

        int ValorIns = 0;

        int opcionMenu = 0;

        while (opcionMenu != 5)
            try{
                Icola co1 = new Cola1();
                Cola c = new Cola(5);
                System.out.println("1. Insertar");
                System.out.println("2. Eliminar");
                System.out.println("3. Mostrar");
                System.out.println("4. Mostrar log");
                System.out.println("5. Salir");
                opcionMenu = num.nextInt();
                switch (opcionMenu){
                    case 1:
                        System.out.println("Valor a ingresar: ");
                        ValorIns = num.nextInt();
                        co1.insertar(c,ValorIns);
                        break;
                    case 2:
                        co1.eliminar(c);
                        break;
                    case 3:
                        co1.mostrar(c);
                        break;
                    case 4:
                        Icola proxy = new ColaProxy(co1);
                        proxy.insertar(c,ValorIns);
                        proxy.mostrar(c);
                        proxy.eliminar(c);
                        proxy.mostrar(c);
                        break;
                    case 5:
                        System.out.println("Hasta la proxima");
                        break;
                }
            }catch (Exception e){
                System.out.println("Error");
            }
    }
}

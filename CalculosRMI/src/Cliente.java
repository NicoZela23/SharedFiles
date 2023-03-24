import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor a ser calculado");
        int numero = sc.nextInt();
        Calculos calculos;
        calculos = (Calculos) Naming.lookup("rmi://localhost/Ecuaciones");
        System.out.println("El ultimo valor de " + numero + " en Fibonacci es: " + calculos.Fibonacci(numero));
        System.out.println("El valor de " + numero + " en Sumatoria es: " + calculos.Sumatoria(numero));
        System.out.println("El valor de " + numero + " en Factorial es: " + calculos.Factorial(numero));
    }
}
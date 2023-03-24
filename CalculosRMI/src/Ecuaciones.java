import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Ecuaciones extends UnicastRemoteObject implements Calculos {
    public Ecuaciones() throws RemoteException{
        super();
    }

    @Override
    public int Factorial(int numero) throws RemoteException {
        int factorial = 1;
        for (int i = numero; i>0; i--){
            factorial = factorial*i;
        }
        return factorial;
    }

    @Override
    public int Sumatoria(int numero) throws RemoteException {
        int iSumatorio = 0;
        int iContador = numero;
        while (iContador != 0){
            iSumatorio = iSumatorio + iContador;
            iContador--;
        }
        return iSumatorio;
    }

    @Override
    public int Fibonacci(int numero) throws RemoteException {
        if (numero == 0){
            return 0;
        }else if (numero == 1){
            return 1;
        }else {
            return Fibonacci(numero - 1) + Fibonacci(numero - 2);
        }
    }
}
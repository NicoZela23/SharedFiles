import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculos extends Remote {
    int Factorial (int numero) throws RemoteException;
    int Sumatoria (int numero) throws RemoteException;
    int Fibonacci (int numero) throws RemoteException;
}

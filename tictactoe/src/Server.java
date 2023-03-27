import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server {

    public static void main(String[] args) {

        try {
            java.rmi.registry.LocateRegistry.createRegistry(1099);
            System.out.println("Registro de RMI listo");
        }
        catch(RemoteException e) {
            System.err.println("RMI ya esta funcionando");
        }

        try {
            TicTacToe game = new TicTacToe();
            Naming.rebind("TicTacToe", game);
            System.out.println("Servidor de TicTacToe listo");

            game.garbageCollector();
        }
        catch(Exception e) {
            System.err.println("Error con el servidor de TicTacToe");
        }
    }
}

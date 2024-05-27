import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public interface interfaz extends Remote {
    //metodos que el cliente puede invocar de manera remota
    String mensaje() throws RemoteException;
    double suma(double a, double b) throws RemoteException;
}
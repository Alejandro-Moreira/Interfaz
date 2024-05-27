import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class implementacion extends UnicastRemoteObject implements interfaz{
    //constructor
    public implementacion() throws RemoteException {
        super();
    }
    //Implementar los metodos
    public String mensaje() throws RemoteException {
        return "Hola desde el servidor";
    }
    public double suma(double a,double b) throws RemoteException {
        return a+b;
    }
}

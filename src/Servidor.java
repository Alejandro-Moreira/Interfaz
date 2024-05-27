import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {
    public static void main(String[] args) throws RemoteException {
        try {
        //Crear una instancia de la implementacion de la interfaz
        interfaz objetoremoto=new implementacion();
        //crear registro en un puerto especifico
            Registry registro = LocateRegistry.createRegistry(1099);
        //vincular la implementacion remota con un nombre especifico
            registro.rebind("Clienteremoto", objetoremoto);
            System.out.println("Servidor inicializado");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

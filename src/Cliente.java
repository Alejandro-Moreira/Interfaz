import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
    public static void main(String[] args) {
        //Obtener el registro
        Registry registro;
        try {
            registro = LocateRegistry.getRegistry("localhost",1099);
            //Crear la instancia de la implementacion de la interfaz
            interfaz objetoremoto = (interfaz) registro.lookup("Clienteremoto");
            String mensaje=objetoremoto.mensaje();
            System.out.println(mensaje);

            double repuesta=objetoremoto.suma(6,7);
            System.out.println(repuesta);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

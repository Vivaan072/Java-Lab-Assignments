
import java.rmi.registry.*;

public class TempServer {
    public static void main(String[] args) throws Exception {
        LocateRegistry.createRegistry(1099);

        TempService service = new TempImpl();

        Registry registry = LocateRegistry.getRegistry();
        registry.rebind("Temperature", service);

        System.out.println("Temperature server is ready.");
    }
}

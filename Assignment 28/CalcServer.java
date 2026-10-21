
import java.rmi.registry.*;

public class CalcServer {
    public static void main(String[] args) throws Exception {
        LocateRegistry.createRegistry(1099);

        CalcService service = new CalcImpl();

        Registry registry = LocateRegistry.getRegistry();
        registry.rebind("Calculator", service);

        System.out.println("Calculator server is ready.");
    }
}

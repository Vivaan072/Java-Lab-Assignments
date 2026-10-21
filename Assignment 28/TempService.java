
import java.rmi.*;

public interface TempService extends Remote {
    double celsiusToFahrenheit(double c)
        throws RemoteException;

    double fahrenheitToCelsius(double f)
        throws RemoteException;
}

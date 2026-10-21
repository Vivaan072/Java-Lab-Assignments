
import java.rmi.*;
import java.rmi.server.*;

public class TempImpl extends UnicastRemoteObject
        implements TempService {

    public TempImpl() throws RemoteException {
        super();
    }

    public double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}


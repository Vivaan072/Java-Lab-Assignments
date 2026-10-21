
import java.rmi.*;
import java.rmi.server.*;

public class CalcImpl extends UnicastRemoteObject
        implements CalcService {

    public CalcImpl() throws RemoteException {
        super();
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(int a, int b) throws RemoteException {
        if (b == 0)
            throw new RemoteException("Cannot divide by zero");
        return (double) a / b;
    }
}



package common;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteObject extends UnicastRemoteObject implements MyRemoteInterface {
    public MyRemoteObject() throws RemoteException {
        // Constructor
    }

    public int addNumbers(int a, int b) throws RemoteException {
        return a + b;
    }
}


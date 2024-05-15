
package common;

// RMI.src.common

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyRemoteInterface extends Remote {
    int addNumbers(int a, int b) throws RemoteException;
}

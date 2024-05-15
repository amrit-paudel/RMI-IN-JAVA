
package server;
import java.rmi.Naming;
// import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import common.MyRemoteInterface;
import common.MyRemoteObject;

public class Server {
    public static void main(String[] args) {
        try {
            // Create the remote object
            MyRemoteInterface remoteObject = new MyRemoteObject();

            // Start the RMI registry on port 1099
            LocateRegistry.createRegistry(1099);

            // Bind the remote object to the name "MyRemoteObject"
            Naming.rebind("MyRemoteObject", remoteObject);

            System.out.println("Server started.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


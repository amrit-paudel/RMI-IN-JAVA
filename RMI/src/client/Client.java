
package client;

import java.rmi.Naming;

import common.MyRemoteInterface;

public class Client {
    public static void main(String[] args) {
        try {
            // Look up the remote object by its name
            MyRemoteInterface remoteObject = (MyRemoteInterface) Naming.lookup("rmi://localhost/MyRemoteObject");

            // Invoke the remote method
            int result = remoteObject.addNumbers(50, 10);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


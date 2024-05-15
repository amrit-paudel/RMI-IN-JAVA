# File Structure

The root folder of our project is ” RMI”, inside RMI there is “src” folder and inside the src folder there are three folders

- common : It contains the files “MyRemoteInterface.java” and “MyRemoteObject.java”

- client: It contains the files “Client.java”

- server: It contains the file “Server.java”



  


# MyRemoteInterface.java

The MyRemoteInterface.java file in a Java RMI application defines the methods that can be remotely invoked by the client on the server. It acts as a contract or agreement between the client and server, specifying the available methods for remote invocation and their signatures. By implementing this interface, the server provides the functionality that the client can access remotely.

MyRemoteObject.java

The MyRemoteObject.java file in a Java RMI application provides the implementation of the remote methods defined in the remote interface. It contains the actual code that will be executed on the server when the client invokes those methods remotely. This file serves as the concrete implementation of the remote interface and allows the server to fulfill the functionality requested by the client.

Server.java

⦁	Server.java is the server-side component of the Java RMI application.

⦁	It creates an instance of the remote object (MyRemoteObject) that implements the remote interface (MyRemoteInterface).

⦁	It starts the RMI registry on port 1099 using LocateRegistry.createRegistry(1099).

⦁	It binds the remote object to the name "MyRemoteObject" using Naming.rebind("MyRemoteObject", remoteObject).

⦁	It provides the server functionality by listening for incoming client requests and executing the corresponding remote methods on the remote object.

⦁	If any exception occurs during the execution, it prints the stack trace to the console.

⦁	Its main purpose is to set up the server infrastructure, create and bind the remote object, and handle client interactions.

⦁	The server allows clients to remotely access and utilize the functionality provided by the remote object.


Client.java

⦁	Client.java is the client-side component of the Java RMI application.

⦁	It looks up the remote object by its assigned name using Naming.lookup("rmi://localhost/MyRemoteObject").

⦁	It retrieves a reference to the remote object, which allows it to invoke the remote methods defined in the remote interface.

⦁	It invokes the remote method addNumbers(50, 10) on the remote object.

⦁	The client receives the result returned by the server and stores it in the result variable.

⦁	It prints the result to the console using System.out.println("Result: " + result).

⦁	If any exception occurs during the execution, it prints the stack trace to the console.

⦁	Its main purpose is to connect to the server, locate the remote object, invoke remote methods, and retrieve and display the results obtained from the server.

⦁	The client interacts with the server by invoking remote methods and receiving the responses, allowing it to utilize the functionality provided by the remote object


Compiling

javac -d . src/common/MyRemoteInterface.java

javac -d . src/common/MyRemoteObject.java

javac -d . src/server/Server.java

javac -d . src/client/Client.java

By executing these commands, we successfully compiled the Java source code files into bytecode (.class files), which can then be executed by the Java Virtual Machine (JVM) when we run the application. The compiled files will be placed in the corresponding directories based on the package structure defined in the source code

Testing and Verification of RMI Application

Yes, in the given code snippets, the RMI application is being tested by performing the addition of two numbers. The client sends the numbers 50 and 10 to the server by invoking the addNumbers method on the remote object. The server receives these numbers, performs the addition operation, and returns the result to the client. The client then receives the result and prints it to the console.

This addition operation serves as a simple test scenario to demonstrate the remote method invocation and communication between the client and server components in the RMI application. It verifies that the client can successfully invoke a remote method on the server and receive the expected result.

For this we run two commands shown below in the two terminals and we get the desired result

java -classpath . server.Server

java -classpath . client.Client
![image](https://github.com/amrit-paudel/RMI-IN-JAVA/assets/109169586/c4e5ef19-0dbf-4f00-b37d-157cbbc1789a)

 


# RMI-IN-JAVA
A simple implementation of RMI-based communication between client and server applications

File Structure
The root folder of our project is ” RMI”, inside RMI there is “src” folder and inside the src folder there are three folders
⦁	common : It contains the files “MyRemoteInterface.java” and “MyRemoteObject.java”
⦁	client: It contains the files “Client.java”
⦁	server: It contains the file “Server.java”


The MyRemoteInterface.java file in a Java RMI application defines the methods that can be remotely invoked by the client on the server. It acts as a contract or agreement between the client and server, specifying the available methods for remote invocation and their signatures. By implementing this interface, the server provides the functionality that the client can access remotely

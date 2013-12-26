import java.io.*;
import java.net.*;

public class Client {
	Socket socket;
	ObjectInputStream ois;
	ObjectOutputStream oos;
	String ip;
	int port;

	public Client (String ipaddress, int p) {
		ip = ipaddress;
		port = p;
	}

	public void start() {
		try {
			System.out.println("Verbindung versuchen");
			socket = new Socket(ip, port);
			oos = new ObjectOutputStream(socket.getOutputStream());
			System.out.println("Connected to server");
			DataPackage test = new DataPackage();
			test.setVar(-3);
			oos.writeObject(test);
			ois = new ObjectInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		Client client = new Client("127.0.0.1", 7777);
		client.start();
	}
}
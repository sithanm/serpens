import java.io.*;
import java.net.*;

public class Client {
	private Socket socket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private String ip;
	private int port;

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
			Move test = new Move(0);
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
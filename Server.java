import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
	private ArrayList playerStreams;
	private int port;

	public Server(int port) {
		playerStreams = new ArrayList();
		this.port = port;
	}

	public void start() {
		try {
			ServerSocket socket = new ServerSocket(port);

			while (true) {
				Socket client = socket.accept();
				System.out.println("Socket accepted");
				PrintWriter writer = new PrintWriter(client.getOutputStream());
				playerStreams.add(writer);
				System.out.println("Start handler");
				Thread t = new Thread(new ClientHandler(client, this));
				t.start();
				System.out.println("Socket is now fully integrated.");
			}
		} catch (Exception e) {e.printStackTrace();}
	}

	public static void main(String[] args) {
		new Server(7777).start();
	}
}
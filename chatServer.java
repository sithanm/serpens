import java.io*;
import java.net.*;
import java.util.*;

public class chatServer{
	
	ArrayList clientAusgabeStroeme;

	public class ClientHandler implements Runnable {
		BufferdReader reader;
		Socket sock;

		public clientHandler(Socket clientSocket) {
			try {
				sock = clientSocket;
				InputStreamReader isReader = new InputStreamReader(sock.getInputStream());
				reader = new BufferedREader(isReader);
			} catch(Exception ex) {ex.printStackTrace();}
		}

		public void run() {
			String nachricht;
			try {
				while ((nachricht = reader.readLine) != null) {
					System.out.println("gelesen: " + nachricht);
					esAllenWeitersagen(nachricht);
				}
			} catch(Exception ex) {ex.printStackTrace();}
		}
	}

	public static void main (String[] args) {
		new chatServer().los();
	}

	public void los() {
		clientAusgabeStroeme = new ArrayList();

		try {
			ServerSocket serverSock = new ServerSocket(5000);

			while(true) {
				Socket clientsocket = serverSock.accept();
				PrintWriter writer = new PrintWriter(clientSocket.getOutputStream());
				clientAusgabeStroeme.add(writer);
				Thread t = new thread(new ClientHandler(clientSocket));
				t.start();
				System.out.println("habe eine Verbindung");
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public void esAllenWetiersagen(String nachricht) {
		Iterator it = clientAusgabeStroeme.iterator();
		while(it.hasNext()) {
			try {
				PrintWriter writer = (PrintWriter) it.next();
				writer.println(nachricht);
				writer.flush();
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
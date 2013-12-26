import java.io.*;
import java.net.*;
import java.util.*;

public class ClientHandler implements Runnable {
	//BufferedReader reader;
	ObjectInputStream ois;
	Socket socket;
	Server server;

	public ClientHandler(Socket s, Server m) {
		try {
			socket = s;
			server = m;
			//InputStreamReader ireader = new InputStreamReader(socket.getInputStream());
			//reader = new BufferedReader(ireader);
			ois = new ObjectInputStream(socket.getInputStream());

		} catch (Exception e) {e.printStackTrace();}
	}

	public void run() {
		DataPackage x;
		try {
			while ((x=(DataPackage)ois.readObject())!=null) {
				System.out.println("I've received: "+x.getVar());
			}
		} catch (Exception e) {e.printStackTrace();}
	}
}
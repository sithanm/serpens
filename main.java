import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
	JTextArea eingehend;
	JTextField ausgehend;
	BufferedReader reader;
	PrintWriter writer;
	Socket sock;

	pubilc static void main(String[] args) {
		einfacherChatClient client = new einfacherChatClient();
		client.los()
	}

	public void los() {
		JFrame frame= new JFrame("Laecherlich einfacher Chat-Client");
		JPanel hauptPanel = new JPanel();
		eingehend = new JTextArea(15,20);
		eingehend.setLineWrap(true);
		eingehend.setWrapStyleWord(true);
		eingehend.setEditable(false);
		JScrollPane fScroller = new JScrollPane(eingehend);
		fScroller.setVerticalSCrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		fScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		ausgehend = new JTextField(20);
		JButton sendenButton = new JButton("Senden");
		sendenButton.addActionListener(new SendenButtonListener());
		hauptPanel.add(fScroller);
		hauptPanel.add(sendenButton);
		hauptPanel.add(sendenButton);
		netzwerkEinrichten();

		Thread readerThread = new Thread(new EingehendREader());
		readerThread.start();

		frame.getContentPane().add(BorderLayout.CENTER, hauptPanel);
		frame.setSize(400,500);
		frame.setVisible(true);

	}

	public void netzwerkEinrichten() {
		try {
			sock = new Socket("127.0.0.1", 5000);
			InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
			reader = new BufferedREader(streamReader);
			writer = new PrintWriter(sock.getOutputStream());
			System.out.println("Netzwerkverbindung steht");
		} catch(IOException ex) {
			ex.printStackTrace();
		}
	}

	public class SendenButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent ev) {
			try {
				writer.println(ausgehend.getText());
				writer.flush();
			} catch (Exception ex) {
				ex.printStackTrace8);
			}
			ausgehend.setText("");
			ausgehend.requestFocus();
		}
	}

	public class EingehendReader implements Runnable {
		pubilc void run() {
			String nachricht;
			try {
				while ((nachricht=reader.readLine()) != null) {
					System.out.println("gelesen: " + nachricht);
					eingehend.append(nachricht + "\n");
				}
			} catch(Exeption ex) {ex.printStackTrace();}
		}
	}
}
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
	}
}
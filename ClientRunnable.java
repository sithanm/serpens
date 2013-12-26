import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

class ClientDrawer extends JPanel {

    private void doDrawing(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawString("Java 2D", 50, 50);
        g2d.fillOval(100, 100, 10, 10);
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        doDrawing(g);
    }
}


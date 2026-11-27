import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App extends MouseAdapter {

    Frame f;

    App() {

        f = new Frame("Mouse Adapter");

        f.addMouseListener(this);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {

        Graphics g = f.getGraphics();

        g.setColor(Color.BLUE);

        g.fillOval(e.getX(), e.getY(), 20, 20);
    }

    public static void main(String[] args) {

        new App();
    }
}
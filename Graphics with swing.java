import javax.swing.*;
import java.awt.*;

public class Jp {

    public static void main(String[] args){

        System.out.println("Hello World");

        JFrame frame = new JFrame();
        Drawing draw = new Drawing();
        frame.add(draw);
        frame.setSize(500, 600);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class Drawing extends JPanel{

    // We can also use paint(Graphics g){ super.paint(g) and other code } this also works well
    public void paintComponent(Graphics g){
        super.paintComponent(g);

        setBackground(Color.WHITE);

        // Draw means just outline and fill means to fill that area with color selected

        g.setColor(Color.GREEN);
        g.fillRect(10, 20, 100, 50);

        g.setColor(Color.BLUE);
        g.drawRect(10, 80, 100, 50);

        g.setColor(Color.BLACK);
        g.drawString("Hello World", 120, 50);

        g.setColor(Color.ORANGE);
        g.fill3DRect(10, 160, 100, 60, true);

        g.setColor(Color.CYAN);
        g.fillOval(10, 250, 100, 60);

        g.setColor(Color.MAGENTA);
        g.drawLine(10, 500, 300, 45);    // Line should have two points

    }
}

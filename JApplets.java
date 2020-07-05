import javax.swing.*;
import java.awt.*;

public class Jp{

    public static void main(String[] args){

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setSize(500, 500);
        WebApplets w = new WebApplets();
        frame.add(w);

    }

}


class WebApplets extends JApplet{

    // Java Applets are not used that much they are old


    public void paint(Graphics g){

        // Calls the super class
        super.paint(g);

        // Background
        setBackground(Color.GRAY);

        // Content color
        g.setColor(Color.BLACK);

        // Writing a line on the screen
        g.drawString("Hello World", 100, 100);

    }


}
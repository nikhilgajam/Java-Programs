import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Jp {

    public static void main(String[] args){

        new Gui();

    }

}

class Gui extends JFrame{

    public Gui(){


        JLabel lbl = new JLabel("Key Listener");
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        add(lbl);
        JTextField t = new JTextField(10);
        add(t);
        t.addKeyListener(new Listener());

        /*
        Another Method

        t.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

         */

        setTitle("Key Listener");
        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(0, 1));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}

class Listener implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed = " + e.getKeyChar());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed = " + e.getKeyChar());
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released = " + e.getKeyChar());
    }
}
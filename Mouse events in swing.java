import javax.swing.*;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Jp {

    public static void main(String[] args){

        new MouseEvents();

    }

}

class MouseEvents extends JFrame{

    JPanel panel;
    JLabel status_bar;

    public MouseEvents(){

        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        add(panel, BorderLayout.CENTER);

        status_bar = new JLabel("Events will appear here");
        add(status_bar, BorderLayout.SOUTH);

        MouseHandler mh = new MouseHandler();

        panel.addMouseListener(mh);
        panel.addMouseMotionListener(mh);

        // Window settings should be kept after the widgets

        setTitle("Mouse Events");
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    class MouseHandler implements MouseListener, MouseMotionListener {

        // MouseListener Methods

        public void mouseClicked(MouseEvent event){
            panel.setBackground(Color.BLUE);
            status_bar.setText(String.format("Mouse Clicked at X: %s, Y: %s", event.getX(), event.getY()));
        }

        public void mousePressed(MouseEvent event){
            panel.setBackground(Color.CYAN);
            status_bar.setText(String.format("Mouse Pressed at X: %s, Y: %s", event.getX(), event.getY()));
        }

        public void mouseReleased(MouseEvent event){
            panel.setBackground(Color.LIGHT_GRAY);
            status_bar.setText(String.format("Mouse Released at X: %s, Y: %s", event.getX(), event.getY()));
        }

        public void mouseEntered(MouseEvent event){
            panel.setBackground(Color.MAGENTA);
            status_bar.setText(String.format("Mouse Entered at X: %s, Y: %s", event.getX(), event.getY()));
        }

        public void mouseExited(MouseEvent event){
            panel.setBackground(Color.WHITE);
            status_bar.setText(String.format("Mouse Exited at X: %s, Y: %s", event.getX(), event.getY()));
        }

        // MouseMotionListener Methods

        public void mouseDragged(MouseEvent event){
            panel.setBackground(Color.MAGENTA);
            status_bar.setText(String.format("Mouse Dragged at X: %s, Y: %s", event.getX(), event.getY()));
        }

        public void mouseMoved(MouseEvent event){
            panel.setBackground(Color.GREEN);
            status_bar.setText(String.format("Mouse Moved at X: %s, Y: %s", event.getX(), event.getY()));
        }

    }

}
